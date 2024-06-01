//push,pop using Stack 

import java.util.*;
class operations{
    int data;
    operations next,top;
    operations (int d){
        data=d;
        next=null;
    }
    void push(int d){
        operations new_N=new operations(d);
        if(top==null){
            top=new_N;
        }
        else{
            new_N.next=top;
            top=new_N;
        }
    
    }
    void pop(){
        
        if(top==null){
           System.out.println("Stack empy");
            return;
        }
        top=top.next;
    }
    void top(){
        
        if(top==null){
            System.out.println("Stack empy");
            return;
        }
        System.out.println(top.data);
       // top=top.next;
        
    }
      
    

    
    void display(){
        operations temp=top;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;


        }
    }

    
    
    
    public static void main(String args[]){
       
        try (Scanner sc = new Scanner(System.in)) {
            operations obj=new operations(0);
            int n=sc.nextInt();
            while(n!=-1){
                switch(n){
                    case 1 -> obj.push(sc.nextInt());
                    case 2 -> obj.pop();
                    case 3 -> obj.top();
                    case 4 -> obj.display();
                }
                
                n=sc.nextInt();
                
                
            }
        }
        
    }
}