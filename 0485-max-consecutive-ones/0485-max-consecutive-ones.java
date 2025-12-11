class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int res = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                // num == 0 -> end of current streak
                if (count > res) res = count;
                count = 0;
            }
        }
        // final check in case array ends with 1s
        if (count > res) res = count;
        return res ;
    }
}