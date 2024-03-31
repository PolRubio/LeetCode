import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x;

        x = 121;
        System.out.println(solution.isPalindrome(x)); // true

        x = -121;
        System.out.println(solution.isPalindrome(x)); // false

        x = 10;
        System.out.println(solution.isPalindrome(x)); // false

        x = -101;
        System.out.println(solution.isPalindrome(x)); // false

        x = 0;
        System.out.println(solution.isPalindrome(x)); // true
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        String chars = String.valueOf(x);
        int n = chars.length();

        for (int i = 0; i < n/2; i++)
            if (chars.charAt(i) != chars.charAt(n-i-1)) return false;

        return true;
    }
}