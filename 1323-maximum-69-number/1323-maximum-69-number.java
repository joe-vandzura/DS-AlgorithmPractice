class Solution {
    public int maximum69Number (int num) {
        String numAsString = String.valueOf(num);
        String ansAsString = "";
        boolean haveNotChangedValueAlready = true;
        for (int i = 0; i < numAsString.length(); i++) {
            if (numAsString.charAt(i) == '6' && haveNotChangedValueAlready) {
                ansAsString += "9";
                haveNotChangedValueAlready = false;
            } else {
                ansAsString += numAsString.charAt(i);
            }
        }
        return Integer.parseInt(ansAsString);
    }
}