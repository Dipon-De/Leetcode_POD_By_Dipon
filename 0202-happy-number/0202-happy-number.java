class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        if(n<=9) return false;

        int num = n;
        int temp = 0;

        while(num > 0){
            int fd = num % 10 ;
            int sq = fd * fd;
            temp = temp + sq;
            num = num/10;
        }
        if(temp == 1) return true;
        else{
            return isHappy(temp);
        }
    }
}