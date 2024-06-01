import java.util.*;

class tree {
    tree left,right;
    tree(int d){
        left=null;
        right=null;
    }
    tree root;
    tree add(Scanner sc){
        Queue<tree> q=new LinkedList<>();
        int d =sc.nextInt();
        /* 
        tree root =new tree(d);
        q.add(root);
       */
        if(root==null){
            root=new tree(d);
            q.add(root);
        }
        while (!q.isEmpty()) { 
            tree curr=q.remove();
            d=sc.nextInt();
            if(d!=-1){
                curr.left=new tree(d);
                q.add(curr.left);
            }
            d=sc.nextInt();
            if(d!=-1){
                curr.right=new tree(d);
                q.add(curr.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        tree obj = new tree(0);
        obj.add(sc);



        
        
    }//main ends
}//tree class ends
