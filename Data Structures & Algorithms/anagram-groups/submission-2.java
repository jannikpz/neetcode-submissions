class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i < strs.length; i++){
            int[] count = new int[26];
            for(int k =0; k < strs[i].length(); k++){
                ++count[strs[i].charAt(k) - 'a'];
            }
            String key = Arrays.toString(count);
        if(!map.containsKey(key)){
        List<String> liste = new ArrayList<>();
        map.put(key, liste);
        }
        List<String> y = map.get(key);
        y.add(strs[i]);
    }
    Collection<List<String>> values = map.values();
    List<List<String>> result = new ArrayList<>(values);
    return result;
}
}
