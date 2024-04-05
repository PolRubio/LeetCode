public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x;

//        x = 4;
//        System.out.println(solution.mySqrt(x)); // 2
//        System.out.println("\n-------------------\n");
//
//        x = 8;
//        System.out.println(solution.mySqrt(x)); // 2
//        System.out.println("\n-------------------\n");

        x = 2147395600;
        System.out.println(solution.mySqrt(x)); // 46340
        System.out.println("\n-------------------\n");
    }
}

class Solution {
    public int mySqrt(int x) {
        long n = 1;
        while(n*n <= x) n++;
        return (int)n-1;
    }
}