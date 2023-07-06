class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer, List<Integer>> map = new HashMap();
        
        for (int num : arr) {
            if (map.containsKey(Integer.bitCount(num))) {
                List<Integer> replacement = map.get(Integer.bitCount(num));
                replacement.add(num);
                map.replace(Integer.bitCount(num), replacement);
            } else {
                List<Integer> newList = new ArrayList<Integer>();
                newList.add(num);
                map.put(Integer.bitCount(num), newList);
            }
        }
        int[] ans = new int[arr.length];
        
        int index = 0;
        for (List<Integer> list : map.values()) {
            Collections.sort(list);
            for (int num : list) {
                ans[index] = num;
                index++;
            }
        }
                
        return ans;
    }
}