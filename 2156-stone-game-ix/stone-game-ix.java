// class Solution {
//     public boolean stoneGameIX(int[] nums) {
//         int n = nums.length;
//         int sum=0;
//         for(int i:nums){
//             sum += i;
//         }
//         if(n % 2 == 0 && sum % 3 == 0){
//             return true;
//         }else{
//             return
//         }
//     }
// }
class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];

        for (int i : stones) {
            count[i % 3]++;
        }

        if (count[0] % 2 == 0) {
            return count[1] > 0 && count[2] > 0;
        }

        return Math.abs(count[1] - count[2]) > 2;
    }
}