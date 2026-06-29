class Solution {
List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        
        boolean[] visited = new boolean[nums.length];
        List<Integer> path=new ArrayList<>();
        permute(nums,visited,path);
        return ans;
    }
    private void permute(int[] nums,boolean[] visited,List<Integer> path){
        if(path.size() == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
         for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            path.add(nums[i]);
            permute(nums,visited,path);
            path.remove(path.size()-1);
            visited[i] = false;

         }

    }
}