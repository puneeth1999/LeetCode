class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> openers = new HashMap<Character, Character>(){{
            put('(', ')');
            put('[',']');
            put('{','}');
        }};
        HashMap<Character, Character> closers = new HashMap<Character, Character>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(openers.containsKey(c)){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                    return false;
                char popped = stack.pop();
                if(popped != closers.get(c))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}