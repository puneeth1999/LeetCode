class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String s : strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String x = new String(a);
            
            if(map.containsKey(x)){
                ArrayList list = map.get(x);
                list.add(s);
            } else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(s);
                map.put(x, list);
            }
        }
        List<List<String>> res = new ArrayList();
        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            ArrayList<String> v = entry.getValue();
            res.add(v);
        }
        return res;
    }
}