package Sorting;

public class bubbleSort {
    public static void main(String[] args) {


        int[] array = {5, 3, 4, 2, 1};
        printArray(array);
        bubbleSort(array);
        printArray(array);


    }
    public static void bubbleSort(int[] array){
        int length = array.length;
        for(int i = 0; i<array.length - 1; i++){
            for(int j = 0; j<array.length - i - 1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }

        }
    }
    public static void printArray(int[] array){
        System.out.print("[");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
