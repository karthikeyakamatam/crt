import java.util.*;
public class stack1Prob {
        public static void main(String[] args) {
            Stack<Character> stk=new Stack<Character>();
            String str="[]{()}";
            for(char c:str.toCharArray())
            {
                if(c=='('||c=='{'||c=='(')
                {
                    stk.push(c);
                }
                char top=stk.peek();
                if(c==')'&&top=='(')
                {
                    stk.pop();
                }
                else if(c=='}'&&top=='{')
                {
                    stk.pop();
                }
                else if(c==']'&&top=='[')
                {
                    stk.pop();
                }
            }
            if(stk.isEmpty())
            {
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
}