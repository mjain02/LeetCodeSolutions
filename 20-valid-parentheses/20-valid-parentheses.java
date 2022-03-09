class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            try {
                if (ch == '{' || ch == '(' || ch == '[') {
                    stk.push(ch);
                    continue;
                } 

                if ((ch == '}' && stk.peek() == '{') || (ch == ')' && stk.peek() == '(') ||
                  (ch == ']' && stk.peek() == '[')) {
                    stk.pop();
                } else {
                    stk.push(ch);
                }
            } catch (Exception e) {
                return false;
            }
        }
        
        return stk.size() == 0;
    }
}