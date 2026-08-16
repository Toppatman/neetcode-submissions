class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); // creates Hashset

        for (int num : nums) { // Goes through every number in array
            if (!seen.add(num)) { // returns true if number is not added to Hashset
                return true;
            }
        }

        return false;
    }
}