class Solution {
    public int minimumCost(int[] nums) {
        int x = nums[0];
        int[] rem = Arrays.copyOfRange(nums, 1, nums.length);
        Arrays.sort(rem);
        int sum = x+rem[0]+rem[1];
        return sum;
    }
}