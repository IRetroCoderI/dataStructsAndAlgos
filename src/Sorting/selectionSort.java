package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = {3, 53, 22, 31, 12, 11, 2, 1};


        selectionSort(array);
        printArray(array);
    }


    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j<array.length; j++){
                if(array[min] > array[j]){
                    min = j;

                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
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
