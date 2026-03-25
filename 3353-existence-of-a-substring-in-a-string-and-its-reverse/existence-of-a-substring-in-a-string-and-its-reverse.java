class Solution {
    public boolean isSubstringPresent(String s) {
        int i= 0; 

        while(i < s.length()-1){
            int j = s.length() - 1;
            while(j>0){
                if(s.charAt(i) == s.charAt(j) && 
                    (s.charAt(i+1) == s.charAt(j-1))){
                        return true;
                    }
                else{
                        j--;
                    }
            }
            i++;
        }
        return false;
    }
}