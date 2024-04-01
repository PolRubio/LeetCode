public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;

        s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s)); // 5

        s = "   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(s)); // 4

        s = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(s)); // 6
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        String[] ss = s.trim().split(" ");
        return ss[ss.length-1].length();
    }
}