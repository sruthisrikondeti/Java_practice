//Double LinkedList
import java.util.*;

class Doubly{
    int data;
    Doubly previous,next,head,tail;
    Doubly(int d){
        previous = null; 
        data = d;
        next = null;
    }
    void insert(int d ){
        Doubly N=new Doubly(d);
        if(head==null){
            head=N;
            tail=N;
        }
        else{
            N.previous = tail;
            tail.next = N;
            tail=tail.next;
        }
    }
    void insert1(int d){
        Doubly N=new Doubly(d);
        if(head==null){
            head=N;
            tail=N;
        }
        else{
            N.next = head;
            head.previous = N;
            head=head.previous;
        }
    }
    void insertAtRandom(int d, int pos){
        Doubly N=new Doubly (d);
        Doubly temp = head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
            N.next=temp.next;
            temp.next.previous=N;
            N.previous=temp;
            temp.next=N;
        }
    }
    void delete()
    {
        if(head==null){
            System.out.println("not found");
            return;
        }
        head=head.next;
    }
    void display(Doubly head)
    {
        Doubly temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        temp=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.previous;
        }
    }

    
    public static void main(String args[])
    {
        Doubly obj = new Doubly(0);
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while(n!=-1)
            {
                obj.insert(n);
                obj.insert1(n);
                obj.insertAtRandom(sc.nextInt(),sc.nextInt());
                obj.delete();
                obj.display(obj.head);
                n=sc.nextInt();
            }
        }  
    }
}