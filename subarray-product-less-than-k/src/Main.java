public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int k;

        nums = new int[]{10, 5, 2, 6};
        k = 100;
        System.out.println(solution.numSubarrayProductLessThanK(nums, k));

        nums = new int[]{1,2,3};
        k = 0;
        System.out.println(solution.numSubarrayProductLessThanK(nums, k));
    }
}

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k){
        int number = 0;
        int tmp = 1;

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                tmp *= nums[j];
                if(tmp >= k) break;
                number++;
            }
            tmp = 1;
        }
        return number;
    }
}


/*
 10             +
 10 - 5         +
 10 - 5 - 2     -
 10 - 5 - 2 - 6
 5              +
 5 - 2          +
 5 - 2 - 6      +
 2              +
 2 - 6          +
 6              +
 */