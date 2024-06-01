//Sum of leaf
import java.util.*;

public class Soleaf {
    int data;
    Soleaf L,R0,R;
    Soleaf (int d){
        L=null;
        data=d;
        R=null;
    }
    Soleaf add(Scanner sc ){
        Queue<Soleaf> q=new LinkedList<>();
        int d =sc.nextInt();
        /* 
        Soleaf R0 =new Soleaf(d);
        q.add(R0);
       */
        if(R0==null){
            R0=new Soleaf(d);
            q.add(R0);
        }
        while (!q.isEmpty()) { 
            Soleaf curr=q.remove();
            d=sc.nextInt();
            if(d!=-1){
                curr.L=new Soleaf(d);
                q.add(curr.L);
            }
            d=sc.nextInt();
            if(d!=-1){
                curr.R=new Soleaf(d);
                q.add(curr.R);
            }
        }
        return R0;
    }
    static int sum=0;
    void sumofleaf(Soleaf R0){
        if(R0==null){
        return;
    }
    if(R0.L==null&&R0.R==null){
        sum+=R0.data;
    }
    sumofleaf(R0.L);
    sumofleaf(R0.R);
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Soleaf obj = new Soleaf(0);
    Soleaf R0=obj.add(sc);
    obj.sumofleaf(R0); 
    System.out.println(sum);  
    
}
}