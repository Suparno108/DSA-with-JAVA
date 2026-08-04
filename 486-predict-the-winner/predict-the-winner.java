// class Solution {
//     public boolean predictTheWinner(int[] nums) {
        
//         int n = nums.length;
//         int i=0, j=n-1, sum1 = 0, sum2 = 0,count=0;
//         while(n!=0){
//             if(count % 2 == 0){
//                 if(nums[i]>=nums[j]){
//                     sum1 += nums[i];
//                     i++;
//                     n--;
//                     //count++;
//                 }else{
//                     sum1 += nums[j];
//                     j--;
//                     n--;
//                     //count++;
//                 }
//                 count++;
//             }else{
//                 if(nums[i]>=nums[j]){
//                     sum2 += nums[i];
//                     i++;
//                     n--;
//                     //count++;
//                 }else{
//                     sum2 += nums[j];
//                     j--;
//                     n--;
//                     //count++;
//                 }
//                 count++;
//             }
            
//         }
//         if(sum1 >= sum2){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        if (n % 2 == 0) return true;
        
        int[] dp = nums.clone();
        for (int i = n - 2; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[n - 1] >= 0;
    }
}