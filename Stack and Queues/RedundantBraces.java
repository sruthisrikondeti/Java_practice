import java.util.*;
class RedundantBraces
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            String s=sc.next();
            Stack<Character> st=new Stack<>();
            boolean b=true;
            for(int i=0;i<s.length();i++)
            {
                
                if(s.charAt(i)==')'){
                    char c=st.pop();
                    b=true;
                    while(c!='('){
                        if(c=='+'||c=='-'||c=='*'||c=='/')
                             b=false;
                            c=st.peek();
                             st.pop();
                    }
                    if(b==true)
                    {
                        System.out.println("Yes");
                        break;
                    }
                }
                else
                {
                    st.push(s.charAt(i));
                }
            }//for close
            if(b==false)
            System.out.println("No");
        }
        
    }
}