// import java.util.*;

public class sorting {
    public static void main(String[] args) {
        int[] nums = {4, 5, 3, 2, 1};
        int res = minSwaps(nums);
        System.out.println(res);
    }

    public static int minSwaps(int[] nums) {
        int swapCountAsc = 0;
        int swapCountDesc = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) { // If it's an even index, it should be ascending
                if (nums[i] > nums[i + 1]) {
                    swapCountAsc++;
                }
            } else { // If it's an odd index, it should be descending
                if (nums[i] < nums[i + 1]) {
                    swapCountDesc++;
                }
            }
        }

        if (swapCountAsc % 2 == 0 && swapCountDesc % 2 == 0) {
            return 1;
        }

        return 0;
    }
}