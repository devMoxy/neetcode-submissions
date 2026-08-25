class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for(String word : strs){
            encode.append(word.length());
            encode.append('#');
            encode.append(word);
        }
        return encode.toString();
    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        // find the '#' starting from i
        int j = str.indexOf('#', i);
        // extract and parse the length
        int k = Integer.parseInt(str.substring(i,j));
        // extract the word using that length
        String subString = str.substring(j + 1,j + 1 + k);
        // add word to result
        result.add(subString);
        // move i forward
        i = j + k + 1;
    }
    return result;
}
}