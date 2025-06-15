class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        char[] maxchars = s.toCharArray();
        char[] minchars = s.toCharArray();
        int n = s.length();

        for(int i=0;i<n;i++){
            if(maxchars[i] != '9'){
                char target = maxchars[i];
                for(int j=0; j<n;++j){
                    if(maxchars[j] == target){
                        maxchars[j]='9';
                    }
                }
                break; 
            }
        }
        if(minchars[0]>'1'){
            char target = minchars[0];
            for(int i=0;i<n;++i){
                if(minchars[i]==target){
                    minchars[i] = '1';
                }
            }
        }else{
            for(int i=0;i<n;++i){
                if(minchars[i]>'1'){
                    char target = minchars[i];
                    for(int j=i;j<n;++j){
                        if(minchars[j]==target){
                            minchars[j]='0';
                        }
                    }
                    break;
                }
            }
        }
        int maxnum = Integer.parseInt(new String(maxchars));
        int minnum = Integer.parseInt(new String(minchars));
        return maxnum - minnum ;
    }
}