class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles<numExchange) return numBottles;
        int res = numBottles;
        while(numBottles>=numExchange){
            int curr = numBottles/numExchange;
            res = curr + res;
            numBottles = (numBottles - numExchange * curr) + curr;
        }
        return res;
    }
}