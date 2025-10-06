class Solution {
    public int[] plusOne(int[] digits) {
        int pos = digits.length-1;
        while(pos>0 && digits[pos]==9){
            digits[pos]=0;
            pos--;
        }
        if(pos==0 && digits[pos]==9){
            int[] res = new int[digits.length+1];
            Arrays.fill(res,0);
            res[0]=1;
            return res;
        }
        digits[pos]++;
        return digits;
    }
}