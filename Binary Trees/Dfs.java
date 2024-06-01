import java.util.*;
public class Dfs {
    int data;
    Dfs L,R0,R;
    Dfs (int d){
        L=null;
        data=d;
        R=null;
    }
    Dfs add(Scanner sc ){
        Queue<Dfs> q=new LinkedList<>();
        int d =sc.nextInt();
        /* 
        Dfs R0 =new Dfs(d);
        q.add(R0);
       */
        if(R0==null){
            R0=new Dfs(d);
            q.add(R0);
        }
        while (!q.isEmpty()) { 
            Dfs curr=q.remove();
            d=sc.nextInt();
            if(d!=-1){
                curr.L=new Dfs(d);
                q.add(curr.L);
            }
            d=sc.nextInt();
            if(d!=-1){
                curr.R=new Dfs(d);
                q.add(curr.R);
            }
        }
        return R0;
    }
    void preorder(Dfs R0){
        if(R0==null){
            return;
        }
        System.out.println(R0.data);   //R0LR
        preorder(R0.L);
        preorder(R0.R);
    }
    void Inorder(Dfs R0){
        if(R0==null){
            return;
        }
        Inorder(R0.L);
        System.out.println(R0.data);  //LR0R
        Inorder(R0.R);
    }
    void postorder(Dfs R0){
        if(R0==null){
            return;
        }
        postorder(R0.L);
        postorder(R0.R);
        System.out.println(R0.data);  //LRR0
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Dfs obj = new Dfs(0);
        Dfs R0=obj.add(sc);
        System.out.println("preorder");
        obj.preorder(R0);
        System.out.println("Inorder");
        obj.Inorder(R0);
        System.out.println("postorder");
        obj.postorder(R0);
        
        
    }
   
}
