//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
      static Node getMid(Node head)
      {
          Node slow=head;
          Node fast=head.next;
          while(fast!=null && fast.next!=null)
          {
              slow=slow.next;
              fast=fast.next.next;
          }
          return slow;
      }
      
      static Node merge(Node h1,Node h2)
      {
          Node dummy=new Node(0);
          Node curr=dummy;
          
          while(h1!=null&&h2!=null)
          {
              if(h1.data<=h2.data)
              {
                  curr.next=h1;
                  h1=h1.next;
                  curr=curr.next;
              }
              else{
                  curr.next=h2;
                  h2=h2.next;
                  curr=curr.next;
              }
          }
          while(h1!=null)
          {
              curr.next=h1;
              h1=h1.next;
              curr=curr.next;
          }
          while(h2!=null)
          {
              curr.next=h2;
              h2=h2.next;
              curr=curr.next;
          }
          return dummy.next;
      }
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        // add your code here
        //find mid
        Node mid=getMid(head);
        
        Node rHead=mid.next;
        mid.next=null;
        Node newL=mergeSort(head);
        Node newR=mergeSort(rHead);
        //return
        return merge(newL,newR);
    }
}


