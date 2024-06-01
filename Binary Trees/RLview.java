import java.util.*;
public class RLview {
    int data;
    RLview left,root,right;
    
    RLview (int d){
        left=null;
        data=d;
        right=null;
    }
    RLview add(Scanner sc ){
        Queue<RLview> q=new LinkedList<>();
        int d =sc.nextInt();
        /* 
        RLview root =new RLview(d);
        q.add(root);
       */
        if(root==null){
            root=new RLview(d);
            q.add(root);
        }
        while (!q.isEmpty()) { 
            RLview curr=q.remove();
            d=sc.nextInt();
            if(d!=-1){
                curr.left=new RLview(d);
                q.add(curr.left);
            }
            d=sc.nextInt();
            if(d!=-1){
                curr.right=new RLview(d);
                q.add(curr.right);
            }
        }
        return root;
    }

    static int maxlevel=0;
    void Rightview(RLview root,int level){
        if(root==null){
            return;
        }
       
        
    if(maxlevel<level){
        maxlevel=level;
        System.out.println(root.data+" ");
    }
    Rightview(root.right,level+1);
    Rightview(root.left,level+1);

    }
    static int Lmaxlevel=0;
    void Leftview(RLview root,int level){
        if(root==null){
            return;
        }
       
        
    if(Lmaxlevel<level){
        Lmaxlevel=level;
        System.out.println(root.data+" ");
    }
    Leftview(root.left,level+1);
    Leftview(root.right,level+1);

    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RLview obj = new RLview(0);
        RLview root=obj.add(sc);
        System.out.println("Rightview-order");
        obj.Rightview(root,1);
        System.out.println("leftview-order");
        obj.Leftview(root,1);
        
    }
   
}