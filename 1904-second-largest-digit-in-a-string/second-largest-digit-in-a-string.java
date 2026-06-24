class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int s_max = -1;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int temp = c - '0';
                if(temp > max){
                        s_max = max;
                        max = temp;
                }
                else if(temp > s_max && temp<max){
                    s_max = temp;
                } 
            }
        }
        return s_max;
    }
}