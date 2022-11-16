package Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {


        int[] list = {2, 5, 23, 22, 1, 7, 8, 9};
        printArray(list);
        insertionSort(list);
        printArray(list);


    }

    public static void insertionSort(int[] array){
        for(int i = 0; i<array.length - 1; i++){
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] >temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(", ");
            }

        }
        System.out.println("]");
    }
}
