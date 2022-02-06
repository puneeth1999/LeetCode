// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int sc = 0, sr = 0;
        int ec = matrix[0].length - 1, er = matrix.length -1;
        ArrayList<Integer> l = new ArrayList<Integer>();
        while(sc <= ec && sr <= er){
            // sr - left to right
            for(int i = sc; i <= ec; i++){
                l.add(matrix[sr][i]);
            }
            sr++;
            // ec - top to bottom
            for(int i = sr; i <= er; i++){
                l.add(matrix[i][ec]);
            }
            ec--;
            if(sr <= er){
                // er - right to left
                for(int i = ec; i >= sc; i--){
                    l.add(matrix[er][i]);
                }
            }
            er--;
            if(sc <= ec){
                for(int i = er; i >= sr; i--){
                    l.add(matrix[i][sc]);
                }
            }
            sc++;
        }
        return l;
    }
}
