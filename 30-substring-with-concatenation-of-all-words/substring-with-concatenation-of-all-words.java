class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        int wordlen = words[0].length();
        int totallen = wordlen * words.length;
        if(totallen > s.length()){
            return list;
        }
        Map<String,Integer> map = new HashMap<>();
        for(String ss : words){
            map.put(ss,map.getOrDefault(ss,0) + 1);
        }

        for(int i=0;i<=s.length() - totallen;i++){
        
            Map<String,Integer> c_map = new HashMap<>();
             for (int j = 0; j < totallen; j += wordlen) {
                 String piece = s.substring(j + i, i + j + wordlen);
                 c_map.put(piece,c_map.getOrDefault(piece,0)+1);
        }
        if(c_map.equals(map)){
            list.add(i);
        }
}
        return list;
    }
}