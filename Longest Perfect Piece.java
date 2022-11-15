//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestPerfectPiece(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        // code here
        int result=1;
        int last=0;
        int max=arr[0];
        int min=arr[0];
        int i=1;
        int y=0;
        int mi=0;
        int si=0;
        while(i<N)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
                mi=i;
            }
            if(arr[i]<=min)
            {
                min=arr[i];
                si=i;
            }
            if(max-min<=1)
            {
                y=i-last+1;
                i++;
                if(y>result)
                {
                    result=y;
                }
            }else{
                if(arr[i]==max)
                {
                    si++;
                    min=arr[i];
                    last=si;
                }else{
                    mi++;
                    max=arr[i];
                    last=mi;
                }
            }
        }
        return result;
    }
};




//Another Approach

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.longestPerfectPiece(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        // code here
      Queue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
      Queue<Integer>qq=new PriorityQueue<>();
      int j=0;
      int ans=0;
      for(int i=0;i<N;i++)
      {
          q.add(arr[i]);
          qq.add(arr[i]);
          while(j<N && q.peek()-qq.peek()>1)
          {
              q.remove(arr[j]);
              qq.remove(arr[j]);
              j++;
          }
          ans=Math.max(ans,i-j+1);
      }
      return ans;
    }
};
