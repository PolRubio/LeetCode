public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int val;

        nums = new int[]{3, 2, 2, 3};
        val = 3;
        System.out.println(solution.removeElement(nums, val)); // 2
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n------\n");

        nums = new int[]{0,1,2,2,3,0,4,2};
        val = 2;
        System.out.println(solution.removeElement(nums, val)); // 5
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n------\n");
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0; i<nums.length; i++)
            if(nums[i]!=val)
                nums[j++] = nums[i];
        return j;
    }
}