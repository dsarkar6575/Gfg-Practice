//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	    //taking input using class Scanner
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking total count of all testcases
    	 int t = sc.nextInt();
    	 sc.nextLine();
    	 boolean flag = false;
    	 while(t-- > 0){
    	  
    	  //taking the input String
    	  String s=sc.nextLine();
    	  
    	  //Creating an object of class Geeks
    	  Geeks obj=new Geeks();
    	  
    	  //calling the checkString
    	  //method of class Geeks
    	  obj.checkString(s);
    	   
    	 }
    }
}
// } Driver Code Ends


//User function Template for Java



class Geeks{
    
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
        //Your code here
        
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)==' ')
           {
               continue;
           }
           else if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'|| s.charAt(i)=='i'||s.charAt(i)=='u')
           {
               v++;
           }else{
               c++;
           }
       }
       if(v==c)
       {
           System.out.println("Same");
       }
       else if(v>c)
       {
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
}

//Position this line where user code will be pasted.
