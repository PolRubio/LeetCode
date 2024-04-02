public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack;
        String needle;

        haystack = "sadbutsad";
        needle = "sad";
        System.out.println(solution.strStr(haystack, needle)); // 0

        haystack = "leetcode";
        needle = "leeto";
        System.out.println(solution.strStr(haystack, needle)); // -1

        haystack = "a";
        needle = "a";
        System.out.println(solution.strStr(haystack, needle)); // 0

        haystack = "mississippi";
        needle = "issip";
        System.out.println(solution.strStr(haystack, needle)); // 4

        haystack = "mississippi";
        needle = "issi";
        System.out.println(solution.strStr(haystack, needle)); // 1
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;

        int j=0;
        for(int i=0; i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(j)) {
                if(++j>=needle.length()) {
                    return i - j + 1;
                }
            }
            else{
                i = i-j;
                j = 0;
            }
        }
        return -9999;
    }
}