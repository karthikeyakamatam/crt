
public class HelloWorld {
    public static void main(String[] args) {
       Tree btree=new Tree();
       Node root=null;
       root= btree.addNode(root,4);
       btree.addNode(root,7);
       btree.addNode(root,2);
       System.out.println(root.right.data);
    }
}
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }                        
}
class Tree
{
    Node addNode(Node root,int value)
    {
        if(root==null)
        {
            return new Node(value);
        }
        else if(value<root.data)
        {
            root.left=addNode(root.left,value);
        }
        else if(value>root.data)
        {
            root.right=addNode(root.right,value);
        }
        else
        {
            return root;
        }
        return root;
    }
}