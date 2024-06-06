import java.util.*;
public class stack2Prob {
    public static void main(String[] args) {
        Stack<Character> stk=new Stack<Character>();
        String str="abbaca";
        for(char c:str.toCharArray())
        {
            if(!stk.isEmpty()&&(stk.peek()==c))
            {
                stk.pop();
            }
            else
            {
                stk.push(c);
            }
        } 
        StringBuilder stb=new StringBuilder();
        for(char c:stk)
        {
            stb.append(c);
        }
        System.out.println(stb);
}
}
