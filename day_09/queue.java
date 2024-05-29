class QNode
{
    int data;
    QNode next;
    QNode(int data)
    {
        this.data=data;
        this.next=next;
    }
}
class QueueDS
{
  QNode rear,front;
  QueueDS()
  {
  rear=front=null;
  }

  void enQueue(int data)
  {
    QNode newNode =new QNode(data);
    if(front==null)
     front=rear=newNode;
     else
     {
        rear.next=newNode;
        rear=newNode;
     }
  }
  int deQueue()
  {
    if(front==null)
    return -1;
    else
    {
        QNode temp=front;
        front=front.next;
        if(front==null)
        front=rear=null;
        return temp.data;
    }
  }
public String toString()
{
    String res="Queue:";
    if(front==null)
     res+= "no elements"
    else{
        QNode temp=front;
        res+=temp;
    }
    return res;
}
    
}
public class queue {
    public static void main(String[] args) {
        
    }
}
