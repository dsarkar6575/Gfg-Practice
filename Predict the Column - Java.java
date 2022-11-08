//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

/*Class Geeks with its member function columnWithMaxZero()
* a[][] = matrix input
* n : number of rows and columns each
*/
class Geeks{
    
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code here
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                
                
                    count+=a[j][i];
                
            }
            if(count<min)
            {
                min=count;
                ans=i;
            }
        }
        return ans;
        
        
    }
}

//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking size of 2d-array
		    int n = sc.nextInt();

            //creating a 2d-array
		    int a[][] = new int[n][n];
		    
		    //adding elements to the array
		    for(int i = 0;i<n;i++){
		        for(int j = 0;j<n;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    //creating an object of Geeks clas
		    Geeks obj = new Geeks();
		    
		    //calling the method columnWithMaxZero()
		    //of class Geeks
		    System.out.println(obj.columnWithMaxZero(a, n));
		}
	}
}
// } Driver Code Ends
