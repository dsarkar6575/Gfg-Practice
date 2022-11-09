//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking total number of testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the 2 strings
    	   String s1=sc.next();
    	   String s2=sc.next();
    	   
    	   //creating an object of class Geeks
    	   Geeks obj=new Geeks();
    	   
    	   //calling coutChars method
    	   //of class Geeks and passing
    	   //both the Strings and printing
    	   //the result
    	   System.out.println(obj.coutChars(s1,s2));
    	   
    	 }
    }
}




// } Driver Code Ends
//User function Template for Java

/*Function to count number of characters 
* to make s1 and s2 equal
* s1 : first string
* s2 : second string
*/
class Geeks{
    
    static int coutChars(String s1, String s2)
    {
        
       //Your code here
      int arr[]=new int[26];
      for(int i=0;i<s1.length();i++)
      {
          arr[s1.charAt(i)-'a']++;
      }
      int c=0;
       for(int i=0;i<s2.length();i++)
      {
          arr[s2.charAt(i)-'a']--;
      }
      for(int i=0;i<26;i++)
      {
          c+=Math.abs(arr[i]);
      }
      return c;
       
    }
}

//{ Driver Code Starts.

// } Driver Code Ends
