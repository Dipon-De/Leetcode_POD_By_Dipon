class Solution {
    public int[] plusOne(int[] digits) {
        int pos = digits.length-1;
        while(pos>0 && digits[pos]==9){
            digits[pos]=0;
            pos--;
        }
        int[] res = new int[digits.length+1];
        if(pos==0 && digits[pos]==9){
            Arrays.fill(res,0);
            res[0]=1;
            return res;
        }
        digits[pos]++;
        return digits;
    }
}