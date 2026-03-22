class Solution {
    public int countTestedDevices(int[] bp) {
        int count = 0;
        for(int i=0 ; i< bp.length ; i++ ){
            if(bp[i] - count > 0){
                count++;
            }
        }
        return count;
    }
}