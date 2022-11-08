//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   Geeks obj=new Geeks();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	   
    	 }
    }
}


// } Driver Code Ends
//User function Template for Java



class Geeks{
    
    static void follPatt(String s)
    {
        
        //Your code here
        int x=0;
        int y=0;
        int i=0;
        boolean flag=true;
        while(i<s.length())
        {
            while(i<s.length() && s.charAt(i)=='x')
            {
                x++;
                i++;
            }
            while(i<s.length() && s.charAt(i)=='y')
            {
                y++;
                i++;
            }
            if(x!=y)
            {
                flag=false;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println(0);
        }else{
            if(x==y)
            {
                System.out.println(1);
            }
            else{
            System.out.println(0);
            }
        }
       
     
    }
}


//{ Driver Code Starts.

// } Driver Code Ends
