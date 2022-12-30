//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse(Node head){
        Node curr=head;
        Node pre=null;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node f=reverse(first);
        Node s=reverse(second);
        
        Node dummy=new Node(0);
        Node curr=dummy;
        
        int carry=0;
        while(f!=null || s!=null)
        {
            int fd=(f!=null)?f.data:0;
            int sd=(s!=null)?s.data:0;
            
            int sum=fd+sd+carry;
            carry=sum/10;
            Node newNode=new Node(sum%10);
            curr.next=newNode;
           if(f!=null) f=f.next;
            if(s!=null) s=s.next;
            curr=curr.next;
        }
        if(carry>0)
        {
            Node newNode=new Node(carry);
            curr.next=newNode;
            curr=curr.next;
        }
        return reverse(dummy.next);
    }
}
