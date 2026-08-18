// class Solution {
//     public int largestInteger(int[] nums, int k) {
//         int n = nums.length;
//         int a = nums[0];
//         int b = nums[n-1];
//         int max = 0;
//         if(k > 1 && k < n){
//             if(a!=b){
//                 for(int i=1;i<n-1;i++){
//                     if(nums[i]==a){
//                         a = 0;
//                     }else if(nums[i]==b){
//                         b=0;
//                     }
//                 }
//                 max = Math.max(a,b);
//             }else{
//                 return -1;
//             }
            
//         }else{
//             for(int i:nums){
//                 if(i == max){
//                     continue;
//                 }else{
//                     max = Math.max(max,i);
//                 }
                
//             }
//         }
//         if((k==1 && max==0) || nums[0]==nums[n-1]){
//             return -1;
//         }else{
//             return max;
//         }
//     }
// }
class Solution {
    public int largestInteger(int[] A, int k) {
        int[] f = new int[51];
        for (int x : A)
            f[x]++;

        int res = -1, n = A.length;
        for (int i = 0; i < n; i++) 
            if (k == n || (f[A[i]] == 1 && (k == 1 || i == 0 || i == n - 1)))
                res = Math.max(res, A[i]);

        return res;
    }
}