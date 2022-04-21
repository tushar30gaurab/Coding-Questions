class Solution {
    public String digitSum(String s, int k) {
        
        while(s.length()>k){
            String newstr = "";
            for(int i=0; i<s.length(); i+=k){
                int sum=0;
                String temp = s.substring(i,Math.min(i+k, s.length()));
                for(int itr = 0; itr<temp.length(); itr++){
                    sum += temp.charAt(itr) - '0';
                }
                newstr = newstr + "" + sum;
            }
            
            s = newstr;
        }
        
        return s;
    }
}