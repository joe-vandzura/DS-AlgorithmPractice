class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> boolArray = new ArrayList<>();        
        List<Integer> candiesList = new ArrayList<>();
 
        for (int amount : candies) {
            candiesList.add(amount);
        }
        
        for (int i = 0; i < candiesList.size(); i++) {
            boolean greatest = true;
            for (int j = 0; j < candiesList.size(); j++) {
                if (j != i) {
                    if (candiesList.get(i) + extraCandies < candiesList.get(j)) {
                        greatest = false;
                    }
                }
            }
            boolArray.add(greatest);
        }

        return boolArray;
    }
}