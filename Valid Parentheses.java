public class Solution {
    public boolean isValid(String s) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && (match(stack.peek()) == s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        return stack.isEmpty();
    }
    
    public char match(char c) {
        switch(c) {
            case '{':
                return '}';
            case '[':
                return ']';
            case '(':
                return ')';
        }
            
        return ' ';
    }
}