class Solution {
    public String decodeString(String s) {
        Stack<Integer> numstack = new Stack<>();
        Stack<StringBuilder> strstack = new Stack<>();
        int num=0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = (num*10) + c-'0';
            }
            else if(c == '['){
                 numstack.push(num);
                 num=0;

                 strstack.push(sb);
                 sb = new StringBuilder();
            }
            else if(c == ']'){
                  String rep=sb.toString().repeat(numstack.pop());
                  sb = strstack.pop().append(rep);
            }
            else{
                String str=String.valueOf(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}