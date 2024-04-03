public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums;
        int target;

//        nums = new int[]{1,3,5,6};
//        target = 5;
//        System.out.println(solution.searchInsert(nums, target)); // 2

        nums = new int[]{1,3,5,6};
        target = 2;
        System.out.println(solution.searchInsert(nums, target)); // 1
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<=nums[0]) return 0;
        if(nums[nums.length-1]<target) return nums.length;
        if(nums[nums.length-1]==target) return nums.length-1;

        return recursiveSearch(nums, target, nums.length/2);
    }
    public int recursiveSearch(int[] nums, int target, int index){
        if(nums[index] == target) return index;
        if(nums[index] < target && target < nums[index+1]) return index+1;
        if(nums[index] > target) return recursiveSearch(nums, target, index/2);

        return recursiveSearch(nums, target, (int) (index+index/2+Math.random()*2));
    }
}