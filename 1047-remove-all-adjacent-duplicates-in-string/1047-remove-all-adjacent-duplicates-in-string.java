class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        // Removing dups
        stack.push(s.charAt(0));
       
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }
            else {
                char popper = stack.pop();
                if(popper != c){
                    stack.push(popper);
                    stack.push(c);
                }
            }
        }
        // pop everything and add them to the res string
        String res = "";
        while(!stack.isEmpty()){
            char c = stack.pop();
            res = c+res;
        }
        return res;
    }
}