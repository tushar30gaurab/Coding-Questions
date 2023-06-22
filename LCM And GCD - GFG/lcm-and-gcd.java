//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd = calGCD(A, B);
        long lcm = calLCM(A, B, gcd);
        
        
        return new Long[]{lcm, gcd};
    }
    
    static long calLCM(long A, long B, long gcd){
        return (A*B)/gcd;
    }
    
    static long calGCD(long A, long B){
        if(A==0)
        return B;
        
        if(B==0)
        return A;
        
        if(A==B)
        return A;
        
        if(A>B)
        return calGCD(A-B, B);
        
        return calGCD(A, B-A);
    }
};