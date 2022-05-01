class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        // if(s.charAt(0) == '#' || t.charAt(0) == '#')
        //     return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#' && !stack.isEmpty())
               stack.pop();
            else if(ch != '#')
                stack.push(s.charAt(i));
        }
        
        String str1 = "";
        while(!stack.isEmpty()){
            str1 += stack.pop();
        }
        
        
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(ch == '#' && !stack.isEmpty())
               stack.pop();
            else if(ch != '#')
                stack.push(t.charAt(i));
        }
        
        String str2 = "";
        while(!stack.isEmpty()){
            str2 += stack.pop();
        }
        
        return (str1.compareTo(str2) == 0) ? true : false;
    }
}