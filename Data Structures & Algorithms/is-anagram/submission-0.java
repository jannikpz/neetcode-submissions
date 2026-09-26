class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] counts = new int[26];
        int[] countt = new int[26];
        for(int i = 0; i < s.length(); i++){
            ++counts[s.charAt(i) - 'a'];
            ++countt[t.charAt(i) - 'a'];

            }
        for(int k = 0; k < 26; k++){
            if(counts[k] != countt[k]){
                return false;
            }
        }
        return true;
        }
}