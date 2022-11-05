package Searching;

public class Interpolation {
    public static void main(String[] args) {


        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int index = interpolationSearch(array, 8);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found :(");
        }
    }

    public static int interpolationSearch(int[] array, int target) {
            int hi = array.length - 1;
            int lo = 0;

            while (target >= array[lo] && target <= array[hi] && lo <= hi) {
                int probe = (hi - lo) * (target - array[lo]) / (array[hi] - array[lo]);
                System.out.println("Probe: " + probe);

                if (array[probe] == target) {
                    return probe;
                } else if (array[probe] < target) {
                    lo = probe + 1;
                } else {
                    hi = probe - 1;
                }


            }


            return -1;
        }
    }
