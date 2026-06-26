class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<int[]> list = new ArrayList<>();
        for(int i= 0 ; i < arr.length ; i++){

            list.add(new int[]{Math.abs(arr[i] - x) , arr[i]});
        }
        Collections.sort(list , (a,b) ->{
         if(a[0] == b[0])
            return a[1]-b[1];
        return a[0] - b[0];
        });
        
           List<Integer> ans =new ArrayList<>();

           for(int i=0;i<k;i++){
            ans.add(list.get(i)[1]);
           }

  Collections.sort(ans);
        return ans;
    }
}