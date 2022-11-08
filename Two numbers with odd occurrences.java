//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        int odd=0;
        int even=0;
        int ansXor=0;
        for(int num: Arr)
        {
            ansXor^=num;
        }
        int Rms=ansXor & (-ansXor);
        for(int num: Arr)
        {
            if((num & Rms)==0)
            {
                odd^=num;
            }
            else{
                even^=num;
            }
        }
        if(odd<even)
        {
            int temp=odd;
            odd=even;
            even=temp;
        }
        return new int[]{odd,even};
    }
}
