import java.util.*;
class SQueue
{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    void enQueue(int data)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }

    }
    int deQueue()
    {
        return s1.pop();

    }
    public String toString()
    {
        String res="Queue: ";
        for(int i=s1.size();i>=0;i--)
        res=res+s1.get(i)+" ";
        return res;
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        SQueue q=new SQueue();
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(0);
        System.out.println(q);
    }
}
