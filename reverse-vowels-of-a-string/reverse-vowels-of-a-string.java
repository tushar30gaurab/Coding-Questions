class Solution {

    public String reverseVowels(String s) {
        int start=0, end = s.length()-1;
        char ch[] = s.toCharArray();
        
        while(start<=end){
            char a = ch[start];
            char b = ch[end];
            
            if(isVowel(a) && isVowel(b)){ 
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
               else if(isVowel(a) && !isVowel(b)){
                   end--;
               }
               else if(!isVowel(a) && isVowel(b)){
                   start++;
               }
               else{
                  start++;
                  end--;
               }
        }
        String str = String.valueOf(ch);
        return str;
    }
    
    
        public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u'
           ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
    
}