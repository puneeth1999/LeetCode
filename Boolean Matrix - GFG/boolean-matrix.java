// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            new Solution().booleanMatrix(matrix);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    sb.append(matrix[i][j] + " ");
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // Check if the any of the elements in the first column are 1's.
        boolean isCol = false;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 1) isCol = true;
        }
        // iterate through the matrix again and mark the first element in the column and the row one if the element in the same row/col is 1.
        for(int i = 0; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    matrix[0][j] = 1;
                    matrix[i][0] = 1;
                }
            }
        }
        // Iterate and mark the elements
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[0][j] ==  1) matrix[i][j] = 1;
                else if(matrix[i][0] ==  1) matrix[i][j] = 1;
            }
        }
        // Check if the first row needed to be marked with 1's
        if(matrix[0][0] == 1){
            for(int i = 1; i < matrix[0].length; i++){
                matrix[0][i] = 1;
            }
        }
        // See if the first column has to be marked with 1's
        if(isCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 1;
            }
        }
        
        
    }
}