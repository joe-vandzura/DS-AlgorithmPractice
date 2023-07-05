class Solution {
    public boolean isValid(String s) {
        Stack<Character> parantheses = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(' || current == '{' || current == '[') {
                parantheses.push(s.charAt(i));
            } else if (parantheses.isEmpty()) {
                return false;
            } else if (parantheses.peek() == '(' && current == ')') {
                parantheses.pop();
            } else if (parantheses.peek() == '{' && current == '}') {
                parantheses.pop();
            } else if (parantheses.peek() == '[' && current == ']') {
                parantheses.pop();
            } else {
                return false;
            }
        }
        return parantheses.isEmpty();
    }
}