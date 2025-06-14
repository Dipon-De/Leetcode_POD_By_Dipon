class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ad = Integer.MIN_VALUE;
        int i = 0;
        int n = nums.length;
        int temp;
        while(i<n){
            temp = Math.abs(nums[i]-nums[(i+1)%n]);
            if(temp>ad) ad=temp;
            i++;
        }
        return ad;
    }
}