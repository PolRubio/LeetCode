import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;

        s = "III";
        System.out.println(solution.romanToInt(s)); // 3

        s = "LVIII";
        System.out.println(solution.romanToInt(s)); // 58

        s = "MCMXCIV";
        System.out.println(solution.romanToInt(s)); // 1994
    }
}

class Solution {
    HashMap<Character, Integer> symbolValue = new HashMap<>();
    public int romanToInt(String s) {
        symbolValue.put('I', 1);
        symbolValue.put('V', 5);
        symbolValue.put('X', 10);
        symbolValue.put('L', 50);
        symbolValue.put('C', 100);
        symbolValue.put('D', 500);
        symbolValue.put('M', 1000);

        int num = 0;
        int actual = symbolValue.get(s.charAt(0));
        int next = actual;

        for(int i = 0; i < s.length()-1; i++){
            next = symbolValue.get(s.charAt(i+1));
            if (i != s.length() - 1 && actual < next){
                num -= actual;
            }
            else
                num += actual;
            actual = next;
        }
        num += next;
        return num;
    }
}