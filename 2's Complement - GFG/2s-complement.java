//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String bi = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.complement(bi));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String complement(String bi){
        // code here
        
        int[] arr = new int[bi.length()];
        
        for(int i=0; i<bi.length(); i++){
            
            char ch = bi.charAt(i);
            if(ch == '1'){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
            
        }
        
        int carry = 1;
        for(int i=arr.length-1; i>=0; i--) {
            
            if(carry == 0) break;
            
            arr[i] = arr[i] + carry;
            carry = 0;
            
            if(arr[i] > 1){
                arr[i] = 0;
                carry = 1;
            }
        }
        
        String s = "";
        for(int i=0; i<arr.length; i++) {
            
            s = s+arr[i];
        }
    
    return s;
    }
}