import java.util.Stack;
public class Ex19
 {
    
    public static void main(String[] args) 
    {
        String exp="(a*b)+(a*c)";
        boolean hasRed=check(exp);
        System.out.println(hasRed?"yes":"no");
    }
    static boolean check(String exp)
    {
        Stack<Character> stk=new Stack<>();
        for(char ch:exp.toCharArray())
        {
            if(ch==')')
            {
                int count=0;
                while(stk.peek()!='('){
                    stk.pop();
                    count++;
                }
                stk.pop();
                if(count<2){
                    return true;
                }
                
            }
            else{
                    stk.push(ch);
            }
        }   
        return false;
    }
    
}
