package Searching;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {-2, 3, 4, 7, 8, 9, 11, 13};
        int target = 4;
        int elementOfTarget = search(arr, target);
        System.out.println(elementOfTarget);

    }
    static int search(int[] arr, int target){ //returns index of target
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right){
            mid = (left + right)/2;
            if(arr[mid] == target){
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
