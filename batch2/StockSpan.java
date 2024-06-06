import java.util.Stack;
public class StockSpan
{
    public static void main(String[] args) {
        int arr[]={13,15,12,14,16,8,6,4,10,30};
        span(arr);
    }
    static void span(int arr[])
    {
        int span[]=new int [arr.length];
        Stack<Integer> stk=new Stack<>();
        span[0]=1;
        stk.push(0);
        //Calculate span values for rest of the days
        for(int i=1;i<arr.length;i++)
        {
            while(!stk.isEmpty()&&arr[stk.peek()]<arr[i])
            {
                stk.pop();
            }
            //if stack is empty, arr[i] is greatest 
            span[i]=stk.isEmpty()?(i+1):(i-stk.peek());
            stk.push(i);
        }
        for(int i:span){System.out.print(i+" ");}
    }
}