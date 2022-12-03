//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends




class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code here
        int arr[]=new int[26];
        int max=0;
        for(int i=0;i<line.length();i++)
        {
            arr[line.charAt(i)-'a']++;
            if(max<arr[line.charAt(i)-'a'])
            {
                
                max=arr[line.charAt(i)-'a'];
            }
        }
        
        for(int i=0;i<26;i++)
        {
            if(arr[i]==max)
              return (char)(i+'a');
        }
       return '0';
    }
    
}
