public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits;
        int[] result;

        digits = new int[]{1, 2, 3};
        result = solution.plusOne(digits);
        for (int j : result)
            System.out.print(j);
        System.out.println("\n--------\n");

        digits = new int[]{4, 3, 2, 1};
        result = solution.plusOne(digits);
        for (int j : result)
            System.out.print(j);
        System.out.println("\n--------\n");

        digits = new int[]{9};
        result = solution.plusOne(digits);
        for (int j : result)
            System.out.print(j);
        System.out.println("\n--------\n");

        digits = new int[]{9,8,7,6,5,4,3,2,1,0};
        result = solution.plusOne(digits);
        for (int j: result)
            System.out.print(j);
        System.out.println("\n--------\n");

        digits = new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        result = solution.plusOne(digits);
        for (int j: result)
            System.out.print(j);
        System.out.println("\n--------\n");
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(i > -1){
            if(digits[i]!=9){
                digits[i] += 1;
                return digits;
            }
            digits[i--] = 0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}