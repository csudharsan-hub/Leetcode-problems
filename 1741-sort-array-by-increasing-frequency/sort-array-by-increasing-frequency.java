class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for( int i : nums){
            list.add(i);
        }

        Collections.sort(list , (a,b) -> {
            if(map.get(a) == map.get(b)){
                return b-a;
            }
            return map.get(a) - map.get(b);
        });

        int res[]=new int[nums.length];
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}