//Balanced Parenthesis count program

import java.util.*;
class Balancedcount{
       
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.next();
            Stack<Integer> st=new Stack<>();
            st.push(-1);
            int max=0;
            int count;
            
            for (int i =0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='('){
                    st.push(i);
                }
                else if(st.peek()==-1){
                    st.push(i);
                }
                else{
                    st.pop();
                    count=i-st.peek();
                    max=Math.max(count,max);
                }
            }
            System.out.println(max);
        }
    }

 
    }
