class Solution {
    Map<String, List<String>> map = new HashMap();
    public List<String> wordBreak(String s, List<String> wordDict) {
        // to handle cases like s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" and dict = {'a', 'aaa'}..
        if(map.containsKey(s)){
            return map.get(s);
        }
        List<String> res = new LinkedList<>();
        if(wordDict.contains(s)){
            res.add(s);
        }
        for(int i = 1; i <= s.length(); i++){
            String x = s.substring(0, i);
            if(wordDict.contains(x)){
                List<String> subList = wordBreak(s.substring(i), wordDict);
                for(String substr : subList){
                    res.add(x + " " + substr);
                }
            }
        }
        map.put(s, res);
        return res;
    }
}

