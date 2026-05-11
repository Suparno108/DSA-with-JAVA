import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] separateDigits(int[] nums) {
        // List to store digits since we don't know the final count yet
        List<Integer> resultList = new ArrayList<>();

        for (int number : nums) {
            // Convert number to String: e.g., 13 -> "13"
            String numStr = Integer.toString(number);
            
            // Iterate through each character in the string
            for (int i = 0; i < numStr.length(); i++) {
                // Character.getNumericValue converts '1' to 1
                resultList.add(Character.getNumericValue(numStr.charAt(i)));
            }
        }

        // Convert List back to primitive int array for the result
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}