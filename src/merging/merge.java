package merging;

public class merge {
    public static void main(String[] args){

        int[] array = {5, 3, 8, 2, 9, 10, 4};

        mergeSort(array);

        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void mergeSort(int[] array){
        int len = array.length;
        if (len <= 1) return;// base case
        int middle = len/2;

        int[] left = new int[middle];
        int[] right = new int[len - middle];

        int i = 0; //left array
        int j = 0; //right array

        for(; i<len; i++){
            if(i < middle){
                left[i] = array[i];
            } else {
                right[j] = array[i];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);

    }
    public static void merge(int[] l, int[] r, int[] array){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<l.length && j<r.length){
            if(l[i]<r[j]){
                array[k] = l[i];
                i++;
                k++;
            } else {
                array[k] = r[j];
                j++;
                k++;
            }
        }

        while(i<l.length){
            array[k] = l[i];
            k++;
            i++;
        }
        while(j<r.length){
            array[k] = r[j];
            k++;
            j++;
        }
    }
}
