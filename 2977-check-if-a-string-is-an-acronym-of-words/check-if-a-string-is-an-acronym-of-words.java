class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.size();i++){
            String ss=words.get(i);
            char c=ss.charAt(0);
            sb.append(c);

        }
        return sb.toString().equals(s);
    }
}