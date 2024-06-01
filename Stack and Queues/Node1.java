//Single LinkedList

import java.util.*;
class Node1{
    int data;
    Node1 next,head;
    Node1 (int d){
        data=d;
        next=null;
    }
    void insert(int d){
        Node1 Newnode =new Node1(d);
        if(head==null){
            head=Newnode ;
        }
        else{
            Newnode.next=head;
            head=Newnode ;
        }
    }
        
    
    void display(Node1 head){
        Node1 temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    
    
    
    public static void main(String args[]){
       
        try (Scanner sc = new Scanner(System.in)) {
            Node1 obj=new Node1(0);
            int n=sc.nextInt();
            while(n!=-1){
                obj.insert(n);
                n=sc.nextInt();
               
            }
            obj.display(obj.head);
        }
    }
}