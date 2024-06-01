//Conversion of postfix to infix

import java.util.*;
public class postfixtoinfix {
    
    
    public static void operation(char ch,Stack<Integer> st){
        int a;
         int b;
        switch(ch){
            case '+' : {
                b=st.pop();
                a=st.pop();
                st.push(a+b);
            }
            break;
            case '-' : {
                b=st.pop();
                a=st.pop();
                st.push(a-b); 
            }
            break;
            case '*' : {
                b=st.pop();
                a=st.pop();
                st.push(a*b);
                
            }
            break;
            case '/' : {
                b=st.pop();
                a=st.pop();
                st.push(a/b);
                
            }
            break;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> st=new Stack<>();
            int test=sc.nextInt();
            while(test>0){
                String s=sc.next();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isDigit(c)){
                    st.push(c-'0');
                }
                else{
                   operation(c, st);
                    
                }
            }
            System.out.println(st.pop());
            test--;
        
        }
        }


    
}
}
