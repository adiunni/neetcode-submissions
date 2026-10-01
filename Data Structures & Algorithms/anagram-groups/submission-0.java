class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        Map<String,List<String>> counter = new HashMap();
        for(String str:strs){
            char[] l1 = str.toCharArray();
            Arrays.sort(l1);
            String op2 = new String(l1);
            List<String> op = new ArrayList();
            if(counter.containsKey(op2)){
                op = counter.get(op2);
            } 
            op.add(str);
            counter.put(op2,op);
        }
        for(List<String> ops: counter.values()){
            res.add(ops);
        }
        return res;
    }
}
