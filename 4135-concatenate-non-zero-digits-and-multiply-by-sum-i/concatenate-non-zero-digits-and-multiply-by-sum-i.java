class Solution {
    public long sumAndMultiply(int n) {
        long x = 0, sum = 0;
        long count = 1;
        while(n!=0){
            int z = n%10;
            if(z != 0){
                x += z * count;
                count *= 10;
                sum += z;
                n /= 10;
            }else{
                n /= 10;
            }
        }
        return sum * x;
    }
}