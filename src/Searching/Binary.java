package Searching;
import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 9, 11, 13, 20, 44, 52, 55, 60, 300, 405};
        int target = 11;


        System.out.println(binarySearchRecursion(arr, 0, arr.length-1, target));
    }

    public static int binarySearchRecursion(int[] arr, int start, int end, int target){


        if(start > end){
            return -1;
        }

        int mid = (start+end)/2;


        if(arr[mid] == target){
            return mid;
        } else if(target > arr[mid]){
            return binarySearchRecursion(arr, mid+1, end, target);
        } else if(target < arr[mid]){
            return binarySearchRecursion(arr, start, mid-1, target);
        }

        return -1;
    }

}
