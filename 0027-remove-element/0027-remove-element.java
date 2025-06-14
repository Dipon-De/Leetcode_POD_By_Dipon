class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length;
        if(n==0){
            return 0;
        }else if((n-1)==0 && nums[0]==val){
            return 0;
        }else if((n-1)==0 && nums[0]!=val){
            return 1;
        } 
        int curr = 0;
        int last = n-1;
        int out = n;
        while(curr<=last){
            if(nums[last]==val){
                last--;
                out--;
            }else if(nums[curr]==val){
                int temp = nums[curr];
                nums[curr] = nums[last];
                nums[last] = temp;
                last--;
                out--;
            }else{
                curr++;
            }
        }
        return out;
    }
}