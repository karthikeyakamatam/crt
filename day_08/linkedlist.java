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
            
            newNode.next=data;

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
}    
}
