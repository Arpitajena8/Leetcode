class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;

        int totalZeros = 0;
        for (int num : nums) {
            if (num == 0) {
                totalZeros++;
            }
        }

        int zerosAtEnd = 0;
        for (int i = n - totalZeros; i < n; i++) {
            if (nums[i] == 0) {
                zerosAtEnd++;
            }
        }

        return totalZeros - zerosAtEnd;
    }
}