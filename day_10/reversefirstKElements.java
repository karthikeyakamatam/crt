import java.util.*;
public class reversefirstKElements {
public static void main(String[] args) {
    ArrayDeque<Integer> queue =new ArrayDeque<>();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        queue.offerLast(arr[i]);
    }
    System.out.println(queue);
    int k=sc.nextInt();
    reversefirstkelements(queue,k);
    sc.close();
    System.out.println(queue);
    
}
static void reversefirstkelements(ArrayDeque<Integer> queue,int k) 
{
    Stack<Integer> s=new Stack<>();
    for(int i=1;i<=k;i++)
    {
        s.push(queue.pollFirst());

    }
    while(!s.isEmpty())
    {
        queue.offerLast(s.pop());
    }
    for(int i=1;i<=queue.size()-k;i++)    //using size mthod
    {
        queue.offerLast(queue.pollFirst());  // using dequ
    }
}

}