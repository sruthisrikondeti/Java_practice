////conversion of Infix to Prefix

import java.util.*;

public class Infixtoprefix{
    public static int Precedence(char ch){
        switch(ch){
            case '+', '-' -> {
                return 1;
            }
            case '*', '/' -> {
                return 2;
            }
            case '^' -> {  
                return 3;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.nextLine();
            StringBuilder sb = new StringBuilder(s); //s=new StringBulider(s).reverse().toString();
            String s1 = (sb.reverse()).toString();
            Stack <Character> st = new Stack<>();
            String str="";
            
            for(int i=0;i<s1.length();i++){
                char c = s1.charAt(i);
                if(Character.isLetterOrDigit(c)){ //if(Character.isAlphabetic(s.charAt(i))){}
                    str+=c;
                }
                else if (c==')') {
                    st.push(c);
                }
                else if (c=='('){
                    while(!st.isEmpty()&& st.peek()!=')'){
                        str+=st.pop();
                    }
                    st.pop();
                }
                else{
                    while(!st.isEmpty()&&Precedence(c)<Precedence(st.peek())){
                        str+=st.pop();
                    }
                    st.push(c);
                }
                
            }
            while(!st.isEmpty()){
                str+=st.pop();
            }
            StringBuilder sb1= new StringBuilder(str);
            String s2=(sb1.reverse()).toString();
            System.out.println(s2);
        }
    }
   

}