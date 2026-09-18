class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder word = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                word.append(s.charAt(i));
            }
        }
        String result = word.toString().toLowerCase();

        for(int i = 0; i < result.length(); i++){
            if(result.charAt(i) != result.charAt(result.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}