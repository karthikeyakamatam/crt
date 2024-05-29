class SNode{
    int data;
    SNode next;
    SNode(int data)
    {
        this.data=data;
        this.next=next;

    }
}
class LLstack
{
    SNode top;
    LLstack()
    {
        top=null;
    }
    void push(int data)   //insertion at beginnig
    {
        SNode newNode=new SNode(data);
        newNode.next=top;
        top=newNode; 
    }
    int pop()
    {
        if(isEmpty())
        return -1;

        SNode temp=top;
        top=top.next;
        return temp.data;


    }
    void print()
    {
        if(isEmpty())
        {
            System.out.println("stack has no elements");
        }
        else
        {
            SNode temp=top;
            while(temp!=null)
            {
                System.out.println(temp.data+" ->");
                temp=temp.next;
            
            }
        }

    }
    
    boolean isEmpty()
    {
        return top==null;
    }


}
public class stack {
public static void main(String[] args) {
    LLstack stk =new LLstack();
    stk.print();
    stk.push(6);
    stk.push(4);
    stk.push(8);
    stk.print();
}    
}
