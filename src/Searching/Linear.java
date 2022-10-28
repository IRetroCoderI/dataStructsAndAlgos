package Searching;
import java.util.Random;
public class Linear {
    public static void main(String[] arg) {
        int[] nums = {1, 3, 5, 6, 3, 6, 67, 34,};

        System.out.println(findNum(nums, 00));
        System.out.println(nums.length - 1);
    }

    public static int findNum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i+1;
            }
        }

        return -1;
    }
}

