// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
            {
                arr[i] = Integer.parseInt(S1[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxValue(arr,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxValue(int[] A, int N) {
        // for(A[i] + i)
        int max1 = A[0];    //A[0]+0
        int min1 = A[0];    //A[0]+0
        // for(A[j] - j)    
        int max2 = A[0];    //A[0]-0
        int min2 = A[0];    //A[0]-0
        for(int i = 0; i < N; i++){
            max1 = Math.max(max1, A[i] + i);
            min1 = Math.min(min1, A[i] + i);
            
            max2 = Math.max(max2, A[i] - i);
            min2 = Math.min(min2, A[i] - i);
        }
        int res = Math.max(max1 - min1, max2 - min2);
        return res;
    }
};