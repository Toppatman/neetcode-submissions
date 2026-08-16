class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>(); // Stores number and index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find complment number to add to equal to target

            if (seen.containsKey(complement)) { // returns the two numbers if they are equal to target
                return new int[] {seen.get(complement), i};
            }

            seen.put(nums[i], i); // stores the current number and its index in the HashMap
        }

        return new int[] {}; // returns empty int array if no two number sum equals to target
    }
}
