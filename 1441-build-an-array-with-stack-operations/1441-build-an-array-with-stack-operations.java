class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> stk = new ArrayList<>();
        int j = 0;
        for(int i=1;i<=n && j<target.length;i++){
            stk.add("Push");
            if(i == target[j]){
                j++;
            }else{
                stk.add("Pop");
            }
            // if(j == target.length-1 && target[j] == i) return stk
        }
        return stk;
    }
}