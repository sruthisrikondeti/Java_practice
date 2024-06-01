import java.util.*;

public class Height {
    Height L,R0,R;
    Height (int d){
        L=null;
        R=null;
    }
    Height add(Scanner sc ){
        Queue<Height> q=new LinkedList<>();
        int d =sc.nextInt();
        if(R0==null){
            R0=new Height(d);
            q.add(R0);
        }
        while (!q.isEmpty()) { 
            Height curr=q.remove();
            d=sc.nextInt();
            if(d!=-1){
                curr.L=new Height(d);
                q.add(curr.L);
            }
            d=sc.nextInt();
            if(d!=-1){
                curr.R=new Height(d);
                q.add(curr.R);
            }
        }
        return R0;

    }

    int height(Height R0){
        if(R0==null){
            return 0;
        }
       int lh=height(R0.L);
       int rh=height(R0.R);
        return 1+Math.max(lh,rh);

    }

    int diameter(Height R0){
        if(R0==null){
            return 0;
        }
        int lh=height(R0.L);
        int rh=height(R0.R);
        int ld=diameter(R0.L);
        int rd=diameter(R0.R);
        
        
        return Math.max(lh+rh+1,Math.max(ld,rd));
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Height obj = new Height(0);
        Height R0=obj.add(sc);
        System.out.println(obj.height(R0));
        System.out.println(obj.diameter(R0));

    }
}
