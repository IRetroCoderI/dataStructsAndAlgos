package arrays_and_memory;

public class arrays {
    public static void main(String[] args) {
        int[] myInts = {12, 15, 22, 35};
        String[] names = {"Harry", "Hermoine", "Snape", "Ron", "Neville"};
        char[] alph = {'a', 'b', 'c', 'd', 'e'};
 //       System.out.println(myInts[3]);

        int max = 0;
        int[] nums = {2, 7, 11, 8, 11, 8, 3, 11};
        for(int i = 0; i<nums.length; i++){
            for(int j = 1; j<nums.length; j++){
                System.out.println(nums[i]+ " "+ nums[j] );
                if(nums[i]<nums[j]){
                    max = nums[j];
                }
            }
        }
        System.out.println("Max num is: " + max);
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == max){
                count++;
            }
        }
        System.out.println("Shows up " + count + " times");
    }
}
