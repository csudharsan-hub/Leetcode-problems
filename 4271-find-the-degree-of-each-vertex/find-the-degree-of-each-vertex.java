class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int[] num=matrix[i];
            int count=0;
            for(int j=0;j<num.length;j++){
                if(num[j] == 1) count++;
            }
            arr[i]=count;
        }
        return arr;
    }
}