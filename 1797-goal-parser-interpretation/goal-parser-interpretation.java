class Solution {
    public String interpret(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(c == 'G' || c == 'a' || c == 'l'){
                sb.append(c);
            }
            else if( c == '(' && s.charAt(i+1) == ')' ){
                sb.append("o");
            }
        }
        return sb.toString();
    }
}