class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();  // for memory
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry != 0){
            int bitA = (i>=0) ? a.charAt(i) - '0' : 0;  //convert string to int a.charAt(i) - '0'
            int bitB = (j>=0) ? b.charAt(j) - '0' : 0;
            
            int sum = bitA + bitB + carry;
            int resultbit = sum % 2;
            carry = sum/2;

            sb.append(resultbit);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}