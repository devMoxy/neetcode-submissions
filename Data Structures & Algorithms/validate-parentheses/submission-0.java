class Solution {
    public boolean isValid(String s) {
        if((s.length() % 2) != 0) return false;
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(char ch : s.toCharArray()){
            if((ch == '(') || (ch == '{') || (ch == '[')){
                stack.push(ch);
            }else
            {
                if(stack.isEmpty()){
                    return false;                
            }
            else
            {
                char match = map.get(ch);
                if(map.get(ch).equals(stack.pop())){
                    continue;
                }else{
                    return false;
                }
            }
        }
    }
    if(stack.isEmpty()) return true;
    return false;
}
}
