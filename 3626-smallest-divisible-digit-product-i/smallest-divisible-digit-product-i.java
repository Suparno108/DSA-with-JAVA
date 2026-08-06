class Solution {
    public int smallestNumber(int n, int t) {
        int x = n,rem;
        while(true){
            int sum = 1;
            if(x%10 == 0){
                return x;
            }else{
                int temp = x;
                while(temp!=0){
                    rem = temp%10;
                    sum *= rem;
                    temp /=10;
                }
            }
            if(sum%t==0){
                return x;
            }else{
                x++;
            }
        }
    }
}