import java.util.*;
public class balanceparenthesis{
public static boolean isBalanced(Stack<Character> st,String s) {
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if (ch == '(' || ch == '{' || ch == '[') {
            st.push(ch);
        }
        else if (ch == ')' || ch == '}' || ch == ']') {
            if (st.isEmpty()) {
                return false;
            }
            char top = st.pop();
            if(!((top == '(' && ch == ')') ||
            (top == '{' && ch== '}') ||
            (top == '[' && ch == ']'))){
                 return false;
            }
        }
    }
    return st.isEmpty();
}
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            Stack<Character> st = new Stack<>();
            if (isBalanced(st,input)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Not Balanced");
            }
        }
    }
}