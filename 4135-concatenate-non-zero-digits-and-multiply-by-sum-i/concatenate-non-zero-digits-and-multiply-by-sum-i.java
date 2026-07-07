class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        int pro=0;
        while(n!=0){
            int rem=n%10;
            if(rem!=0){
                sum+=rem;
                pro = pro*10 + rem;
            }
            n/=10;
        }
      
        long product=0;
        while(pro!=0){
            int rem = pro%10;
            product = product*10+rem;
            pro/=10;
        }
       return sum*product;
    }
}