class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int f=nums[0], l=nums[n-1];
        int i = f, j=0;
        while(i<=l){
            if(i==nums[j]){
                i++;
                j++;
            }else{
                arr.add(i);
                i++;
            }
        }
        return arr;
    }
}