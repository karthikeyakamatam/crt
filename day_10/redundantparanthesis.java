/*
 * given a string of balanced, find if it contains a redundant parenthis or not.
 * A set of parenthis is redundant if same sub expression is surrounded by unnecessary or multiple brackets.
 * print 'yes' print redundant else 'no'
 * 
 */
import java.util.*;
public class redundantparanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.next();
        System.out.println(redundantpar(exp));
    }
    static boolean isOperator(char g)
    {
        String p= "+-*/";
        return g.contains(p+"");
    }
    static String redundantpar(String exp)
    {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char current=exp.charAt(i);
            if (current!=')')
            stk.push(current);
            else
            {
                boolean operatorfound=false;
                while(!stk.isEmpty() && stk.peek()!='(')
                {
                    if(isOperator(stk.pop()))
                    operatorfound=true;
                }
                if(!operatorfound)
                return "yes";
                stk.pop();
            }
        }
        return "No";

    }
}
