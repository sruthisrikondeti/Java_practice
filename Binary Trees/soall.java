//Sum of leaf
import java.util.*;

public class soall {
    int data;
    soall L,R0,R;
    soall (int d){
        L=null;
        data=d;
        R=null;
    }
    soall add(Scanner sc ){
        Queue<soall> q=new LinkedList<>();
        int d =sc.nextInt();
        /* 
        soall R0 =new soall(d);
        q.add(R0);
       */
        if(R0==null){
            R0=new soall(d);
            q.add(R0);
        }
        while (!q.isEmpty()) { 
            soall curr=q.remove();
            d=sc.nextInt();
            if(d!=-1){
                curr.L=new soall(d);
                q.add(curr.L);
            }
            d=sc.nextInt();
            if(d!=-1){
                curr.R=new soall(d);
                q.add(curr.R);
            }
        }
        return R0;
    }
    static int sum=0;
    void sumofleaf(soall R0){
        if(R0==null){
        return;
    }
    sum+=R0.data;
    sumofleaf(R0.L);
    sumofleaf(R0.R);
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    soall obj = new soall(0);
    soall R0=obj.add(sc);
    obj.sumofleaf(R0); 
    System.out.println(sum);  
    
}
}