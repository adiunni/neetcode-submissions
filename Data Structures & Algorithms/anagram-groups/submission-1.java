class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> counter = new HashMap();
        for(String str:strs){
            char[] l1 = str.toCharArray();
            Arrays.sort(l1);
            String op2 = new String(l1);
            counter.putIfAbsent(op2, new ArrayList<>());
            counter.get(op2).add(str);
        }
        return new ArrayList<>(counter.values());
    }
}
