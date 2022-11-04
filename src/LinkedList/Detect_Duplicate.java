/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author ASUS
 */
public class Detect_Duplicate {
class Node
{
    int data;
    Node next;
    int flag;//For detecting duplicate
    Node(int item)
    {
       data=item; 
    }
}
Node head=null;

public  void add(int data)
{
    Node n=new Node(data);
    if(head==null)
    {
        head=n;
        return;
    }
    n.next=null;
    Node curr=head;
    while(curr.next!=null)
    {
        curr=curr.next;
    }
    curr.next=n;
 }

public void  disp()
{
    Node curr=head;
    while(curr!=null)
    {
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
}

public String detect_dup()
{
    Node curr=head;
    while(curr.next!=null)
    {
        if(curr.flag==1)
        {
            return "Found";
        }
        curr.flag=1;
        curr=curr.next;
    }
    return "Not Found";
}

public static void main(String[] args)
{
    Detect_Duplicate l=new Detect_Duplicate();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(3);
    l.add(4);
    
    l.disp();
    System.out.print("Duplicate "+l.detect_dup());
}
}
