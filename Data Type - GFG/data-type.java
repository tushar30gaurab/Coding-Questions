//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            int ans = obj.dataTypeSize(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// import java.util.*;
class Solution {
    static int dataTypeSize(String str) {
        // code here
        Map<String, Integer> hmap = new HashMap<>();
        
        hmap.put("Character",1);
        hmap.put("Integer",4);
        hmap.put("Long",8);
        hmap.put("Float",4);
        hmap.put("Double",8);
        
        return hmap.get(str);
    }
}