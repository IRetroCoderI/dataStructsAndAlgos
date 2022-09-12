package Sorting;


public class quickSort {
    public static void main(String[] args) {
        // quick sort
        // = moves smaller elem. to left of pivot
        //   recursively divides array in 2 partitions
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        printArray(array);
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }


    private static void quickSort(int[] array, int start, int end){
        if(end <= start) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot+1, end);

    }
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start - 1;
        for(int j = start; j <= end -1; j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
    static void printArray(int[] array){
        System.out.print("[");
        for(int i = 0; i<array.length; i++){
            if(i!=0 && i!=array.length){
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
