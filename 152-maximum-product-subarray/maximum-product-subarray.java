class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

            for(int i = 0 ; i< nums.length ; i++){
                int multi = 1;
                for(int j = i;j<nums.length;j++){
                    multi *= nums[j];
                    max=Math.max(max,multi);
                }
                

            }
        return max;
      }
}