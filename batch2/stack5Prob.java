import java.util.Stack;

public class stack5Prob {
    public static void main(String[] args) {
        Stack<Integer> stk =new Stack<Integer>();
        Stack<Integer> stk1 =new Stack<Integer>();
        int arr[]={10,20,30,40,50};
        int k=30;
        for(int i=0;i<arr.length;i++)
        {
            stk.push(arr[i]);
        }
       while(!stk.isEmpty())
        {
            if(stk.peek()==k)
            {
                stk.pop();
            }
            else{
                stk1.push(stk.pop());
            }
        }
        while(!stk1.isEmpty())
        {
            stk.push(stk1.pop());
        }
        System.out.println(stk);
        /*for(int i:stk)
        {
            if(i!=30)
            {                                        // Alternate Method
                stk1.push(i);
            }
        }
        System.out.println(stk1);*/
}
}
