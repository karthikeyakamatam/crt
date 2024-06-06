class Node
{
    int data;
    Node n1=null,n2=null;
    Node(int data)
    {
        this.data=data;
    }
}
public class TreeOne {
    public static void main(String[] args) {
        Node root = new Node(0);
        root.n1=new Node(1);
        root.n2=new Node(2);
        System.out.println(root.n1.data);

    }
    
}
