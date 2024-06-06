import java.util.LinkedList;
import java.util.Stack;
public class LlremoveDup {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        int arr[]={1,1,2,3,3,4,5,6,7,7};
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        Stack<Integer> stk=new Stack<>();
        for(int i=list.size()-1;i>=0;i--)
        {
            stk.push(list.get(i));
        }
        list.clear();
        int n=stk.size();
        for(int i=0;i<n;i++)
        {
            if(list.isEmpty())
            {
                list.add(stk.pop());
            }
            else if(list.getLast()==stk.peek())
            {
                stk.pop();
            }
            else
            {
                list.add(stk.pop());
            }
        } 
        System.out.println(list);   
    }

}
