// { Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class DriverClass
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            
            GFG g = new GFG();
            g.rotate(arr);
            printMatrix (arr);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG
{
    static void rotate(int matrix[][]) 
    {
        // Reverse Transpose
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Swap the rows
        int top = 0, bottom = matrix.length - 1;
        while(top < bottom){
            for(int i = 0; i < matrix[0].length; i++){
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = temp;
            }
            top++; bottom--;
        }
    }
}