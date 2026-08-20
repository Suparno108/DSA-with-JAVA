class Solution {
    public int[] resultArray(int[] nums) {
        int m1 = nums[0];
        int m2 = nums[1];
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(m1);
        arr2.add(m2);

        for(int i=2;i<nums.length;i++){
            if(m1>m2){
                arr1.add(nums[i]);
                m1 = nums[i];
            }else{
                arr2.add(nums[i]);
                m2 = nums[i];
            }
        }
        arr1.addAll(arr2);

        int[] arr = new int[arr1.size()];

        for(int i = 0; i < arr1.size(); i++){
            arr[i] = arr1.get(i);
        }

        return arr;
    }
}