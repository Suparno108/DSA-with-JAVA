class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums){
            arr.add(i);
        }

        int count = 0;

        while(!check(arr)){
            int x = 0;
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < arr.size()-1; i++){
                int sum = arr.get(i) + arr.get(i+1);
                if(sum < min){
                    min = sum;
                    x = i;
                }
            }

            arr.set(x, min);
            arr.remove(x+1);
            count++;
        }
        return count;
    }

    boolean check(ArrayList<Integer> dekho){
        for(int i =1;i<dekho.size();i++){
            if(dekho.get(i) < dekho.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
