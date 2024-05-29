import java.util.*;
public class paranthesis {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(char ch:s.toCharArray())
        {
            if((ch==')' && st.peek()=='(') ||(ch=='}'&& st.peek()=='{')||(ch==']'&&st.peek()=='['))
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        if(st.isEmpty())
        {
            System.out.println("valid paraenthis");
        }
        else
        {
            System.out.println("invalid paraenthis");
        }
    }
}
