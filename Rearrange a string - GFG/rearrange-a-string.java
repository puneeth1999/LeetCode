// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            int sum = 0;
            String r = "";
            for(int i = 0; i < s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    sum += Integer.parseInt(""+s.charAt(i));
                }
                else{
                    r += s.charAt(i);
                }
            }
            // Sort r
            int[] map = new int[26];
            for(int i = 0; i < map.length; i++)
                map[i] = -1;
                
            for (int i = 0; i < r.length(); i++){
                char c = r.charAt(i);
                int x = c - 'A';
                // System.out.print(c + "- "+x+" ");
                map[x]= map[x] + 1;
            }
            
            String res = "";
            for(int i = 0; i < map.length; i++){
                if(map[i] >= 0){
                    for(int y = 0; y <= map[i]; y++){
                        res += ((char)(i + 'A'));
                    }
                }
                
                    
            }
            res += sum;
            return res;
            
        }
}
