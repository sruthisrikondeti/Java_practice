
//Level order Traversal
import java.util.*;

class levelo {
    int data;
    levelo left,right,root;
    levelo(int d){
        left=null;
        data=d;
        right=null;
    }
    
    levelo add(Scanner sc){
        Queue<levelo> q=new LinkedList<>();
        int d =sc.nextInt();
        /* 
        levelo root =new levelo(d);
        q.add(root);
       */
        if(root==null){
            root=new levelo(d);
            q.add(root);
        }
        while (!q.isEmpty()) { 
            levelo curr=q.remove();
            d=sc.nextInt();
            if(d!=-1){
                curr.left=new levelo(d);
                q.add(curr.left);
            }
            d=sc.nextInt();
            if(d!=-1){
                curr.right=new levelo(d);
                q.add(curr.right);
            }
        }
        return root;
    }
    void LevelOderTraversal(levelo root){
      Queue<levelo> q=new LinkedList<>();
      if(root==null){
        System.err.println("Tree is empty");
        return;
      }
      q.add(root);
      System.out.println(root.data+" ");
      while(!q.isEmpty()){
        levelo curr=q.remove();
        if(curr.left!=null){
            q.add(curr.left);
            System.out.println(curr.left.data);
        }
        if(curr.right!=null){
            q.add(curr.right);
            System.out.println(curr.right.data);
        }

      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        levelo obj = new levelo(0);
    
        obj.LevelOderTraversal(obj.add(sc));
        



        
        
    }//main ends
}//levelo class ends
