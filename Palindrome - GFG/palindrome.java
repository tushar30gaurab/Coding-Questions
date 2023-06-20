//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String is_palindrome(int x)
    {
        int sign = x<0 ? -1 : 1;
        int n = Math.abs(x);
        // Code here
        int temp = n;
        int reverse = 0;
        
        while(temp>0) {
            int d = temp%10;
            reverse = reverse*10 + d;
            temp = temp/10;
        }
        reverse = reverse * sign;
        
        return (reverse == x) ? "Yes" : "No";
    }
}