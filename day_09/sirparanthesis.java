import java.util.*;
public class sirparanthesis {
static boolean isBalanced(String exp)
{
    Stack<Character> st=new Stack<>();
    String open="{[(";
    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);
        if(open.contains(ch+""))
        {
            st.push(ch);
        }
        else
        {
            if(st.isEmpty())
            return false;
            else if(ch=='}' && st.peek()!='}')
            return false;
            else if(ch==')' && st.peek()!='(')
            return false;
            else if(ch==']' && st.peek()!='[')
            return false;
            else
            st.pop();

        }
        return true;
    }
} 
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    System.out.println(isBalanced(s));
}
}
