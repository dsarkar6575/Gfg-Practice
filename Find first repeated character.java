//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
       char arr[]=s.toCharArray();
       ArrayList<Character> list=new ArrayList<>();
       String st="";
       for(int i=0;i<s.length();i++)
       {
           if(list.contains(arr[i]))
           {
               st+=arr[i];
               return st;
           }else{
               list.add(arr[i]);
           }
       }
       
       st="-1";
       return st;
    }
} 
