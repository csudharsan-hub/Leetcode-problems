class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set=new HashSet<>();
        StringBuilder num=new StringBuilder();

        for(char ch : word.toCharArray()){
            if(Character.isDigit(ch)){
                num.append(ch);
            }
            else{
                if(num.length()!=0){
                    String nums=removeZeros(num.toString());
                    set.add(nums);
                    num.setLength(0);
                    
                }
            }
        }
       if(num.length() != 0){
         String nums=removeZeros(num.toString());
         set.add(nums);
       }
       return set.size();

    }
    private String removeZeros(String num){
        int i=0;

        while(i < num.length() && num.charAt(i) == '0'){
            i++;
        }

        if(i==num.length()) return "0";

        return num.substring(i);
    }
}