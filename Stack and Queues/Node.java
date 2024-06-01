//Single LinkedList operations

import java.util.*;
class Node{
    int data;
    Node next,head;
    Node (int d){
        data=d;
        next=null;
    }
    void push(int d){
        Node Newnode=new Node(d);
        if(head==null){
            head=Newnode;
        }
        else{
            Newnode.next=head;
            head=Newnode;
        }
    }
    void pop(int d){
        
        if(head==null){
             System.out.println("Stack is empty");
            
        }
        head=head.next;
    }
    void head(){
        
        if(head==null){
            System.out.println("Stack is empty");
            return;
        }
    
        System.out.println(head.data);
    }
      
    

    
    void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    
    
    
    public static void main(String args[]){
       
        try (Scanner sc = new Scanner(System.in)) {
            Node obj=new Node(0);
            int n=sc.nextInt();
            while(n!=-1){
                obj.push(n);
                
                n=sc.nextInt();
            }
            obj.pop(n);
            obj.display(obj.head);
            obj.head();
        }
        
    }
}