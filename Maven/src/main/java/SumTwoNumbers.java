import java.util.Arrays;

public class SumTwoNumbers {

    // Returns TRUE if there are two numbers in the array that sum up to sum
    public static boolean execute(int[] array, int sum) {
        Arrays.sort(array);

        int i = 0;
        int j = array.length-1;

        int sumTemp = array[i] + array[j];
        while (sumTemp != sum) {
            if (sumTemp < sum) {
                i++; // if sum is less than desired, need a larger number
            } else {
                j--; // if sum is more than desired, need a smaller number
            }

            if (i >= j) {
                // reached the end if position i is at or after j
                // if at end and inside the loop, that means sum never reached
                return false;
            }

            sumTemp = array[i] + array[j];
        }

        return true; // reached end of while loop so sum worked
    }
}
