package Searching;
import java.util.Arrays;


public class Binary {
    public static void main(String[] args) {
        int[] array = new int[1_000_000_000];

        int target = 42;

        for(int i = 0; i<array.length; i++){
            array[i] = i; //will fill with nums
        }
        long startTime = System.nanoTime();
        int index = BinarySearch(array, target);
        long endTime = System.nanoTime();

        double elapsed = (endTime - startTime)/1_000_000_000.0;

//        System.out.println("Target found in " + elapsed +  " seconds");


        int middle = array[(array.length-1)/2];
        System.out.println(middle);


    }


    public static int BinarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;


        while(low<high){
            int middle = low + (high - low)/2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if(value<target) low = middle + 1;
            else if(value>target) high = middle -1;
            else return middle; // target found!!!
        }

        return -1;





    }




}
