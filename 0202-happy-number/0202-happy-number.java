import java.util.*;
class Solution {
    Set<Integer> seen = new HashSet<>();
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(n<=0 || seen.contains(n)) return false;
        seen.add(n);
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