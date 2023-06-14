class Solution {
    public String interpret(String command) {
        String interpretation = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                interpretation += "G";
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    interpretation += "o";
                } else {
                    interpretation += "al";
                }
            }
        }
        return interpretation;
    }
}