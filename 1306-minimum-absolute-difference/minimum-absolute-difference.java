class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

       Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        // 2. Find the minimum absolute difference between adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {
            int currentDiff = arr[i + 1] - arr[i]; // No need for abs() as array is sorted
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
            }
        }

        // 3. Loop through the array again to find all pairs with the minimum difference
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                // Add the pair to the result list
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return result;
    }
}