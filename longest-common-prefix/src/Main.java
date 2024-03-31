import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs;

        strs = new String[]{"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs)); // "fl"

        strs = new String[]{"dog","racecar","car"};
        System.out.println(solution.longestCommonPrefix(strs)); // ""

        strs = new String[]{"dog"};
        System.out.println(solution.longestCommonPrefix(strs)); // "dog"

        strs = new String[]{"ab", "a"};
        System.out.println(solution.longestCommonPrefix(strs)); // "a"

        strs = new String[]{"aaa", "aa", "aaa"};
        System.out.println(solution.longestCommonPrefix(strs)); // "aa"
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder common = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        for(int i = 0; i < Math.min(first.length(), last.length()); i++){
            if (last.charAt(i) != first.charAt(i))
                return common.toString();
            common.append(first.charAt(i));
        }
        return common.toString();
    }
}