class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1;
        int missing = 1;   // default missing is 1 if not found yet

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                dup = nums[i];
            }
        }

        // Find missing by checking sorted list
        int expected = 1;
        for(int num : nums) {
            if(num == expected) {
                expected++;
            }
        }
        missing = expected; // this is the real missing number

        return new int[]{dup, missing};
    }
}
