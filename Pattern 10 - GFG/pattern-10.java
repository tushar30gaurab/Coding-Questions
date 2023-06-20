//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int counter = 0;
        for(int i=1; i<= 2*n-1; i++){
            
            if(i<=n){
                counter++;
                for(int j=1;j<=counter; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                counter--;
                for(int j=1; j<=counter; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}