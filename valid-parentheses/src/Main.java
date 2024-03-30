import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;

        s = "()";
        System.out.println(solution.isValid(s)); // true

        s = "()[]{}";
        System.out.println(solution.isValid(s)); // true

        s = "(]";
        System.out.println(solution.isValid(s)); // false

        s = "([)]";
        System.out.println(solution.isValid(s)); // false

        s = "{[]}";
        System.out.println(solution.isValid(s)); // true

        s = "]";
        System.out.println(solution.isValid(s)); // false
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> validations = new Stack<>();

        for(char c : s.toCharArray()){
            switch (c){
                case '(':
                    validations.add(')');
                    break;
                case '{':
                    validations.add('}');
                    break;
                case '[':
                    validations.add(']');
                    break;
                default:
                    if(validations.empty() || validations.pop() != c) return false;
            }
        }
        return validations.size() == 0;
    }
}