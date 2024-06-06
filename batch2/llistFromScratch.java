class Node{
    int data;
    Node next=null;//address of next node
    Node(int data)
    {
        this.data=data;
    }
}
class LinkedList{
    Node head=null,tail=null;
    void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=head;

        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    void display()
    {
        Node temp=head;
        while(head!=null)
        {
            System.out.println(head.data+" ");
            head=head.next;
        }
        head=temp;
    }
    void removeHead()
    {
        head=head.next;
        display();
    }
    void removeTail()
    {
        Node temp,prev=head;
        temp=head;
        while (head.next!=null) {
            prev=head;
            head=head.next;
        }
        prev.next=null;
        head=temp;
        display();
    }
}
public class llistFromScratch {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(3);
        ll.add(7);
        ll.add(4);
        ll.add(5);
        ll.display();
        System.out.println();
        ll.removeTail();
    }
}
