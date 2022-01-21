class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        generateAll(new char[2 * n], 0, result);
        return result;
    }
    
    public void generateAll(char[] current, int pos, List<String> result){
        if(pos == current.length){
            if(isValid(current)){
                result.add(new String(current));
            } 
        } else {
                current[pos] = '(';
                generateAll(current, pos+1, result);
                current[pos] = ')';
                generateAll(current, pos+1, result);
            }
    }
    
    public boolean isValid(char[] arr){
        int balance = 0;
        for(char c : arr){
            if(c == '(') balance++;
            else balance --;
            if(balance < 0) return false; // In case of - )(
        }
        return (balance == 0);
    }
}