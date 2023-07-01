class Solution {
    public int numJewelsInStones(String jewels, String stones) {
//         int count = 0;
        
//         for (int i = 0; i < stones.length(); i++) {
//             for (int j = 0; j < jewels.length(); j++) {
//                 if (stones.charAt(i) == jewels.charAt(j)) {
//                     count++;
//                 }
//             }
//         }
//         return count;
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < jewels.length(); i++) {
            map.put(jewels.charAt(i), 0);
        }
        
        for (int i = 0; i < stones.length(); i++) {
            if (map.containsKey(stones.charAt(i))) {
                map.replace(stones.charAt(i), map.get(stones.charAt(i)) + 1);
            }
        }
        int sum = 0;
        
        for (int num : map.values()) {
            sum += num;
        }
        return sum;
    }
}