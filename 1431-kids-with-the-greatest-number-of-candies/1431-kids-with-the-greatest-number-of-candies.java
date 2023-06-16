class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> boolArray = new ArrayList<>();         
        
        for (int i = 0; i < candies.length; i++) {
            boolean greatest = true;
            for (int j = 0; j < candies.length; j++) {
                if (j != i) {
                    if (candies[i] + extraCandies < candies[j]) {
                        greatest = false;
                    }
                }
            }
            boolArray.add(greatest);
        }

        return boolArray;
    }
}