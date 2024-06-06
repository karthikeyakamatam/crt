class Queue
{
    int size=5,front=0,rear=0;
    int que[] =new int[size];
    int poll()
    {
        if(front==-1&&rear==-1)
        {
            return -1;
        }
        int res=que[++front];
        que[front]=0;
        return res;
    }
    void add(int value)
    {
        if(rear!=size-1)
        {
            que[++rear]=value;
        }
        if(front==size-1)
        {
            front=-1;
            rear=-1;
        }
        return;
    }
    void display()
    {
        for(int i:que)
        {
            System.out.println(i);
        }
    }
}
public class SingularQueue
{
    public static void main(String[] args) {
        Queue q =new Queue();
        int arr[]={1,3,6,7,9};
        for(int i:arr)
        {
            q.add(i);
        }
        q.display();
    }
}