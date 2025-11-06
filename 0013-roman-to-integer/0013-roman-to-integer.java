class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romantoint = new HashMap<>();
        romantoint.put('I',1);
        romantoint.put('V',5);
        romantoint.put('X',10);
        romantoint.put('L',50);
        romantoint.put('C',100);
        romantoint.put('D',500);
        romantoint.put('M',1000);

        char[] rom = s.toCharArray();
        int prev = romantoint.get(rom[0]);
        if (rom.length == 1){
            return prev;
        }
        int res = prev;
        for(int i = 1 ; i<rom.length ; i++){
            int curr = romantoint.get(rom[i]);
            if(curr>prev){
                res = res + curr - 2*prev;
            }else{res = curr+res;}
            prev = curr;
        }
        return res;
    }
}