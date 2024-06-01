import java.util.*;
public class InfixToPostfix {
    public static int precedence(char ch) {
        switch (ch) {
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
            Stack<Character> st=new Stack<>();
            String s=sc.next();
            String temp="";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(Character.isLetterOrDigit(c)){
                    temp+=c;
                }else if (c == '(') {
                    st.push(c);
                } else if (c == ')') {
                    while (!st.isEmpty() && st.peek() != '(') {
                        temp += st.pop();
                    }
                    st.pop();
                }else{
                    while (!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
                        temp += st.pop();
                    }
                    st.push(c);
                }
            }
            while (!st.isEmpty()) {
                temp += st.pop();
            }
            System.out.println(temp);
        }
    }

  
}