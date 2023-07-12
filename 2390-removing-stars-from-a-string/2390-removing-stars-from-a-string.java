class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        
        int stars = 0;
        while (!stack.isEmpty()) {
            if (stack.peek() == '*') {
                while (stack.peek() == '*') {
                    stars++;
                    stack.pop();
                }
                for (int i = 0; i < stars; i++) {
                    if (stack.peek() == '*') {
                        i -= 2;
                    }
                    stack.pop();
                }
                stars = 0;
            } else {
                ans = stack.peek() + ans;
                stack.pop();
            }
            stars = 0;
        }
        
        // 
        
        return ans;
    }
}