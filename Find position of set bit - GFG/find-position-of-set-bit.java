// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        if(N == 0) return -1;
        // code here
        int count = 0;
        int idx = 0;
        int first = -1;
        while(N > 0){
            int x = N & 1;
            if(x == 1) {
                count++;
                first = idx;
            }
            if(count > 1) return -1;
            N = N >> 1;
            idx++;
        }
        return first + 1;
    }
};