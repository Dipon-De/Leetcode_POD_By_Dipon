class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();

        Arrays.sort(sorted);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(sorted[i],i);
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = map.get(nums[i]);
        }
        return res;
    }
}