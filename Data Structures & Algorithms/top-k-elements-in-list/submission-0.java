class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num: nums){
            frequencyMap.put(
                num,
                frequencyMap.getOrDefault(num, 0) + 1
            );
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(number);
        }

        int[] result = new int[k];
        int resultIndex = 0;

        for (int frequency = buckets.length - 1;
             frequency >= 0 && resultIndex < k;
             frequency--) {

            if (buckets[frequency] != null) {
                for (int number : buckets[frequency]) {
                    result[resultIndex++] = number;

                    if (resultIndex == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
