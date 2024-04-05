public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a, b;

        a = "11";
        b = "1";
        System.out.println(solution.addBinary(a, b)); // 100

        a = "1010";
        b = "1011";
        System.out.println(solution.addBinary(a, b)); // 10101

        a = "1111";
        b = "1111";
        System.out.println(solution.addBinary(a, b)); // 11110
    }
}

class Solution {
    public String addBinary(String a, String b) {
        
    }
}