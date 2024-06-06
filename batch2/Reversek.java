import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
public class Reversek {
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        Stack<Integer> stk=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n=5;
        int k=3;
        for(int i=1;i<=n;i++)
        {
            if(i<=k)
            {
                stk.push(i);
            }
            else
            { 
                while(!stk.isEmpty()){q.add(stk.pop());}
                q.add(i);
            }
           
        }
        System.out.println(q);
        sc.close();
    }
}
