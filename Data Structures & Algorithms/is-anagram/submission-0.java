class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        else {
            int n = s.length();
            Map<Character, Integer> charCountA = new HashMap();
            Map<Character, Integer> charCountB = new HashMap();
            for(int i = 0;i<n;i++){
                charCountA.put(s.charAt(i),
                    charCountA.getOrDefault(s.charAt(i),0)+1);
                charCountB.put(t.charAt(i),
                    charCountB.getOrDefault(t.charAt(i),0)+1);
            }
            if(charCountA.equals(charCountB)) return true;
        }
        return false;
    }
}
