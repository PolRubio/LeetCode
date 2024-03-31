public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int target;

        nums = new int[] {2,7,11,15};
        target = 9;
        System.out.println(solution.twoSum(nums, target)[0] + " - " + solution.twoSum(nums, target)[1]); // 0 - 1

        nums = new int[] {3,2,4};
        target = 6;
        System.out.println(solution.twoSum(nums, target)[0] + " - " + solution.twoSum(nums, target)[1]); // 1 - 2

        nums = new int[] {3,3};
        target = 6;
        System.out.println(solution.twoSum(nums, target)[0] + " - " + solution.twoSum(nums, target)[1]); // 0 - 1
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complementari;
        for(int i = 0; i < nums.length; i++){
            complementari = target - nums[i];
            for(int j = 0; j < nums.length; j++){
                if(i!=j && nums[j] == complementari){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}