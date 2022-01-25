class Solution {
    public List<String> generateParenthesis(int n) {
        char[] current = new char[2*n];
        List<String> res = new ArrayList();
        int pos = 0;
        generate(current, pos, res);
        return res;
    }
    public void generate(char[] current, int pos, List<String> res){
        if(pos == current.length){
            if(isValid(current)){
                res.add(new String (current));
            }
        } else{
            current[pos] = '(';
            generate(current, pos+1, res);
            current[pos] = ')';
            generate(current, pos+1, res);
        }
    }
    public boolean isValid(char[] current){
        int balance = 0;
        for(int i = 0; i < current.length; i++){
            if(current[i] == '(')
                balance++;
            else{
                balance--;
                if(balance < 0)
                    return false;
            }
        }
        return balance == 0;
    }
}