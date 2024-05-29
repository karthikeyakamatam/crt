

class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
    this.next=null;
  }
}
class SLList
{
    Node head;
    SLList()
    {
        head=null;

    }
    boolean isListEmpty()
    {
        return head==null;
    }
    void insert(int data)
    {
        Node newNode= new Node(data);
        if(isListEmpty())
        {
           // insert newNode as head Node
         head=newNode;
        }
        else{
         // traverse till we reach to the last node to insert
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        }

       
    }
    void insertAtBegin(int data)
    {   Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        
            
    }
    void insertAfter(int element,int data)
    {
        Node newNode =new Node(data);
        if(isListEmpty())
        {
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                if(temp.data!=element)
                {
                    temp=temp.next;
                }
                else
                break;
            }
            
            

        }
    }
    void print()
    {
      if(isListEmpty())
      {
        System.out.println("no elements");
      }
      else
      {
        Node temp=head;
        while(temp!=null)
        {
             System.out.print(temp.data+"->");
             temp=temp.next;
        }
        System.out.println("null");
        
      }
    }
    boolean removeElement(int element)
    {
        if(isListEmpty())
        {
            return false;
        }
        if(head.data==element)
        {
            head=head.next;
            return true;
        }
        else{
          Node temp=head,previous=null;
          while(temp!=null && temp.data!=element)
          {
            previous=temp;
            temp=temp.next;
          }
          if(temp!=null)
          {
            previous.next=temp.next;
            return true;
          }

        }
        return false;

    }
    int removePosition(int position)
    {
        if(isListEmpty())
           return -1;
        if(position==0)
        {
            Node temp=head;
            head=head.next;
            return temp.data;
        }
        int counter=0;
        Node temp=head,previous=null;
        while(temp!=null && counter<position)
        { 
            previous=temp;
            temp=temp.next;
            counter++;

        }
        if(temp!=null)
        {
            previous.next=temp.next;
            return temp.data;
        }
        return -1;
    }
    int findMid()
    {
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow.data;
    }
    int FindLastk(int k)
    {
        Node temp1=head,temp2=head;
        while(temp2!=null)
        {
            if(k>0)
            {
                temp2=temp2.next;
                k--;
            }
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return temp1.data;

    }
    void revList()
    {
        Node curr=head,previous=null,next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=previous;
            previous=curr;
            curr=next;
         }
         head=previous;
         print();
    }
     boolean cycleExist()
    {
        Node slow1=head,fast1=head;
        while(fast1!=null && slow1!=null)
        {
            slow1=slow1.next;
            fast1=fast1.next.next;
            if(slow1==fast1)
            return true;
        }
        return false;
    }

    int cycleStart()
    {
        Node slow1=head,fast1=head;
        while(fast1!=null && slow1!=null)
        {
            slow1=slow1.next;
            fast1=fast1.next.next;
            if(slow1==fast1)
            break;
        }
        Node temp=head;
        while(temp!=slow1)
        {
            temp=temp.next;
            slow1=slow1.next;

        }
        return slow1.data;
    }


    void cycleRemove()
    {
        Node slow1=head,fast1=head;
        while(fast1!=null && slow1!=null)
        {
            slow1=slow1.next;
            fast1=fast1.next.next;
            if(slow1==fast1)
            break;
        }
        Node temp=head,previous=null;
        while(temp!=slow1)
        {
            temp=temp.next;
            slow1=slow1.next;

        }
        slow1.next=null;
        print();
    }

}

public class linkedlist {
public static void main(String[] args) {
    
    SLList lst=new SLList();
    lst.insert(10);
    lst.insert(20);
    lst.insert(30);
    lst.insert(40);
    lst.insert(50);
    lst.print();
   // System.out.println(lst.findMid());
   // System.out.println(lst.FindLastk(2));
   // lst.revList();

   Node head=n

    System.out.println(lst.cycleExist());



}    
}
