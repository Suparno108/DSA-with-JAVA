class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        if(k==1){
            return 0;
        }else{
            int y=0;
            for(int i=k-1;i<n;i++){
                int x= (nums[i]-nums[y]);
                y++;
                if(min>x){
                    min = x;
                }
            }
        }
        return min;
    }
}