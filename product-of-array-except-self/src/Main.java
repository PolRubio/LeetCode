public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;

        nums = new int[]{1, 2, 3, 4};
        for(int num : solution.productExceptSelf(nums))
            System.out.print(num + " "); // 24 12 8 6
        System.out.println();

        nums = new int[]{-1, 1, 0, -3, 3};
        for(int num : solution.productExceptSelf(nums))
            System.out.print(num + " "); // 0 0 9 0 0

    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int left = 1, right = 1;

        for(int i=0; i<nums.length; i++){
            answer[i] = left;
            left *= nums[i];
        }

        for(int i=1; i<=nums.length; i++){
            answer[nums.length-i] *= right;
            right *= nums[nums.length-i];
        }

        return answer;
    }
}

