class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        char[] chars;
        String sort;
        for(String words : strs){
            chars = words.toCharArray();
            Arrays.sort(chars);
            sort = new String(chars);
            if(map.containsKey(sort)){
                map.get(sort).add(words);
            }else{
               List<String> newList = new ArrayList<>();
               newList.add(words);
               map.put(sort, newList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
