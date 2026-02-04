class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        if(nums[1]>nums[0]){
            for(int i=1;i<n;i++){
                if(nums[i]-nums[i-1] != 0){
                    arr.add(nums[i]-nums[i-1]);
                }else{
                    return false;
                }    
            }
            int x = 2;
            for(int i=1;i<arr.size();i++){
                if(arr.get(i)*arr.get(i-1) < 0){
                    x--;
                }
            }
            if(x==0){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}