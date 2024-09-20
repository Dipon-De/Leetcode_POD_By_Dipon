class Solution {
    public int climbStairs(int n) {
        Map<Integer,Integer> memo = new HashMap<>();
        return cs(n,memo);
    }
    private int cs(int n,Map<Integer,Integer>memo){
        if(n == 0 || n==1 ){
            return 1;
        }
        if(!memo.containsKey(n)){
            memo.put(n,cs(n-1,memo)+cs(n-2,memo));
        }
        return memo.get(n);
    }
}