class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int max=0;
        int sum=0;
        Set<Integer> set=new HashSet<>();
        for(int j=0;j<nums.length;j++){
             sum+=nums[j];
             while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;

             }
             set.add(nums[j]);
             max=Math.max(max,sum);
        }
        return max;
    }
}