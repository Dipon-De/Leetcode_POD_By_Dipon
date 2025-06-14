class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        int indx = 0;
        while (indx < s.length()) {
            char current = s.charAt(indx);
            if (!stk.isEmpty() &&
                    ((stk.peek() == '(' && current == ')') ||
                            (stk.peek() == '{' && current == '}') ||
                            (stk.peek() == '[' && current == ']'))) {
                stk.pop();
            } else {
                stk.push(current);
            }
            indx++;
        }
        if (stk.isEmpty() == true) {
            return true;
        } else {
            return false;
        }
    }
}