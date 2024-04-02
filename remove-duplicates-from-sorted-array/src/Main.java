import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;

        nums = new int[]{1, 1, 2};
        System.out.println(solution.removeDuplicates(nums)); // 2
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n------\n");

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums)); // 5
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n------\n");
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=nums[j])
                nums[++j]=nums[i];
        return ++j;
    }
}