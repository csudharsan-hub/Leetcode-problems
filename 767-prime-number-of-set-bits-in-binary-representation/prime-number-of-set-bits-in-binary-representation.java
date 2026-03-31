class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for(int i = left;i<=right;i++){
            int bit = Integer.bitCount(i);
            if(isprime(bit)){
                c++;
            }
        }
        return c;
    }

    public boolean isprime(int bit){
        if(bit<=1) return false;
        for(int i=2;i*i<=bit;i++){
            if(bit%i==0){
                return false;
            }
        }
        return true;
    }
}