import java.util.LinkedList;
import java.util.Stack;
public class ReverseLlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        Stack<Integer> stk=new Stack<>();
        for(int i=1;i<=5;i++){ll.add(i);}
        System.out.println(ll);
        for(int i=1;i<=5;i++){stk.add(ll.remove());}
        for(int i=1;i<=5;i++){ll.add(stk.pop());}
        System.out.println(ll);
    }
}
