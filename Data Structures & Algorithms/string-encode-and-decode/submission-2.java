class Solution {

    public String encode(List<String> strs) {
    StringBuilder word = new StringBuilder();
    for(String words : strs){
        word.append(words.length());
        word.append('#');
        word.append(words);
    }
    return word.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = str.indexOf('#',i);
            int k = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j + 1,k + j + 1);
            result.add(word);
            i = k + j + 1;
        }
        return result;
    }
    
}
