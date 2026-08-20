class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] char_count = new int[26];

        for(int i = 0; i < s.length(); i++){
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;
        }

        for(int num: char_count){
            if(num != 0){
                return false;
            }
        }
        
        return true;
    }
}
