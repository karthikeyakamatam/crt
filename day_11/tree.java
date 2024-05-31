import java.util.*;
class TreeNode
{
    int data;
   
    TreeNode left,right;

    TreeNode(int data)
    {
        this.data=data;
        left=right=null;
     }
     public String toString()
     {
        return left+""+data+right;
     }
}

class MyBinaryTree
{
    TreeNode root;
    Scanner sc=new Scanner(System.in);
    MyBinaryTree()
    {
        root=null;
    }
TreeNode buildtree()
{
  int data=sc.nextInt();
  if(data==-1)
  {
    return null;
  }
  TreeNode newNode =new TreeNode(data);
  newNode.left=buildtree();
  newNode.right=buildtree();
  return newNode;
}
 
TreeNode bstInsertion(TreeNode root,int data)
{
    if(root==null)
    {
       return new TreeNode(data);
    }
    if(data<root.data)
   root.left= bstInsertion(root.left, data);
   else
   root.right=bstInsertion(root.right, data);

   return root;

}

void inorder(TreeNode root)
{
    if(root==null)
    return;
    inorder(root.left);    // visting left sub tree
    System.out.print(root.data+" "); // visting root
    inorder(root.right);  // visting right subtree

}

void levelorder(TreeNode root,TreeNode dummy)
{
    if(root==null)
    {
        return;
    }
    Queue<TreeNode> queue=new ArrayDeque<>();   //refernce created for the parent classof Queue by Array Deque
    queue.offer(dummy);
    queue.offer(root);
    while(!queue.isEmpty())
    {
        TreeNode temp=queue.poll();
        if(temp==dummy){
            System.out.println();
            if(!queue.isEmpty())
            queue.offer(dummy);
        }
        else
        {
        System.out.print(temp.data+" ");
        if(temp.left!=null)
        queue.offer(temp.left);
        if(temp.right!=null)
        queue.offer(temp.right);
        }

    }
    
}

void leftview(TreeNode root,TreeNode dummy)
{
    if(root==null)
    {
        return;
    }
    Queue<TreeNode> queue=new ArrayDeque<>();   //refernce created for the parent classof Queue by Array Deque
    queue.offer(dummy);
    queue.offer(root);
    while(!queue.isEmpty())
    {
        TreeNode temp=queue.poll();
        if(temp==dummy){
            if(queue.peek()!=null)
            System.out.print(queue.peek().data+ " ");
            if(!queue.isEmpty())
            queue.offer(dummy);
        }
        else
        {
        
        if(temp.left!=null)
        queue.offer(temp.left);
        if(temp.right!=null)
        queue.offer(temp.right);
        }

    }
    
}

void rightview(TreeNode root,TreeNode dummy)
{
    if(root==null)
    {
        return;
    }
    Queue<TreeNode> queue=new ArrayDeque<>();   //refernce created for the parent classof Queue by Array Deque
    queue.offer(root);
    queue.offer(dummy);
    while(!queue.isEmpty())
    {
        TreeNode temp=queue.poll();
        if(temp==dummy){
            if(queue.peek()!=null)
            System.out.print(queue.peek().data+ " ");
            if(!queue.isEmpty())
            queue.offer(dummy);
        }
        else
        {
        
        if(temp.left!=null)
        queue.offer(temp.left);
        if(temp.right!=null)
        queue.offer(temp.right);
        }

    }
    
}

void traverse(TreeNode root,HashMap<Integer,ArrayList<Integer>>coulmns,int distance )
{
    if(root==null)
    return;
    coulmns.putIfAbsent(distance, new ArrayList<Integer>());
    coulmns.get(distance).add(root.data);
    traverse(root.left, coulmns,distance-1);
    traverse(root.right, coulmns,distance+1);
}
void Topview(TreeNode root)
{
    HashMap<Integer,ArrayList<Integer>> columns=new HashMap<>();
    traverse(root,columns,0);
    for(int key: columns.keySet())
    {
        
            System.out.println(columns.get(key).get(0));
        

    }
}


void Bottomview(TreeNode root)
{
    HashMap<Integer,ArrayList<Integer>> columns=new HashMap<>();
    traverse(root,columns,0);
    for(int key: columns.keySet())
    {
        ArrayList<Integer> temp=columns.get(key);
        
            System.out.println(columns.get(temp.size()-1));
        

    }
}

void verticalorder(TreeNode root)
{
    HashMap<Integer,ArrayList<Integer>> columns=new HashMap<>();
    traverse(root,columns,0);
    for(int key: columns.keySet())
    {
        for(int ele:columns.get(key))
        {
            System.out.println(ele+" ");

        }
        

    }
}

void preorder(TreeNode root)
{
    if(root==null)
    return;
    System.out.print(root.data+" "); // visting root
    inorder(root.left);    // visting left sub tree
    inorder(root.right);  // visting right subtree

}

void postorder(TreeNode root)
{
    if(root==null)
    return;
   
    inorder(root.left);    // visting left sub tree
    inorder(root.right);  // visting right subtree
    System.out.print(root.data+" "); // visting root

}

}





public class tree {

    public static void main(String[] args) {
       // MyBinaryTree bitree =new  MyBinaryTree();
        //TreeNode n1= new TreeNode(10);
        //TreeNode n2= new TreeNode(20);
       // TreeNode n3= new TreeNode(30);


   //  bitree.root=bitree.buildtree();
    // bitree.inorder(bitree.root);
  //   System.out.println();
   //  bitree.preorder(bitree.root);
    // System.out.println();
  //   bitree.postorder(bitree.root);



  int[] values={20,15,25,12,13,78,45,30,5,8};
  MyBinaryTree bitree =new  MyBinaryTree();
  TreeNode root=null;
  for(int value: values)
  {
  root=bitree.bstInsertion(root,value);
  }
bitree.verticalorder(root);
  

TreeNode dummy=new TreeNode(-1);
  bitree.inorder(root);
  System.out.println();
  bitree.postorder(root);
  System.out.println();
  bitree.preorder(root);
  System.out.println();
  bitree.levelorder(root,dummy);
  System.out.println();
  bitree.leftview(root, dummy);


     //System.out.println(bitree.root);
    // System.out.println(bitree.root.right.right);
    //System.out.println(bitree.root.left);


      //  bitree.root=n1;
       // bitree.root.left=n2;
      //  bitree.root.right=n3;
      //  System.out.println(bitree.root.left);

 
 
    }
}