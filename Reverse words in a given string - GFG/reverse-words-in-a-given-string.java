// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        int i = 0; int j = 0;
        String s = "";
        while(j < S.length()){
            if(S.charAt(j) == '.'){
                String x = S.substring(i, j);
                s = "." + x + s;
                i = j+1;
            }
            j++;
        }
        String x = S.substring(i, j);
        s = x + s;
        
        return s;
    }
}