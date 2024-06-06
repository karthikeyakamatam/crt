import java.util.Stack;
public class stack4Prob {
    public static void main(String[] args) {
        Stack<Integer> stk =new Stack<Integer>();
        Stack<Integer> stk1 =new Stack<Integer>();
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {
            stk.push(arr[i]);
        }
        while(!stk.isEmpty())
        {
            stk1.push(stk.pop());
        }
        System.out.println(stk1);
    }
}
