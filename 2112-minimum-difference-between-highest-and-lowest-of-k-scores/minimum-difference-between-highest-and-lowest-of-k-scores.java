class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=k-1;i<n;i++){
            int x= (nums[i]-nums[i-(k-1)]);
            if(min>x){
                min = x;
            }
        }
        return min;
    }
}