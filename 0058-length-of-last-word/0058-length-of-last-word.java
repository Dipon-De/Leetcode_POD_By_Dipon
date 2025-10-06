class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1; // find the last index 
        while(end>=0 && s.charAt(end)==' '){
            end--;  //if in the last their is space discard the spaces and reach to the first charecter
        }
        int start = end;
        while(start>=0 && s.charAt(start) != ' '){
            start--;
        }
        return end-start;
    }
}