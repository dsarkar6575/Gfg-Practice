//{ Driver Code Starts
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
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum=0;
	    for(int i:arr)
	    {
	        sum+=i;
	    }
	    
	    boolean pre[]=new boolean[sum+1];
	    pre[0]=true;
	    for(int i=1;i<=n;i++)
	    {
	        boolean curr[]=new boolean[sum+1];
	        curr[0]=true;
	        for(int j=1;j<=sum;j++)
	        {
	            curr[j]=pre[j];
	            if(arr[i-1]<=j)
	            {
	                curr[j]=curr[j] || pre[j-arr[i-1]];
	            }
	        }
	        pre=curr;
	    }
	    int mindiff=sum;
	    for(int i=0;i<=sum;i++)
	    {
	        if(pre[i])
	        {
	            mindiff=Math.min(mindiff,Math.abs(sum-2*i));
	        }
	    }
	    return mindiff;
	} 
}
