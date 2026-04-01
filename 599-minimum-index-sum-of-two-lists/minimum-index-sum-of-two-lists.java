class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();

        for(int i= 0 ;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j < min){
                        list.clear();
                        list.add(list1[i]);
                        min = i+j;
                    }
                    else if(i+j == min){
                        list.add(list1[i]);
                        min = i+j;
                    }

                }
            }
        }
        return list.toArray(new String[0]);
    }
}