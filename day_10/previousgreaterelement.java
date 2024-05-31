/*
 * given an array of "N" distinct integers, find the closest(postion -wise) greater on left of every element.
 * if there is no greater element on left then print -1.
 */
import java.util.*;
public class previousgreaterelement {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    sc.close();
    previousgreater(arr);
}
public static void previousgreater(int[] arr) 
{
    Stack<Integer>  stk=new Stack<>();
    for(int i=0;i<arr.length;i++)
    {
        int current=arr[i];
        while(!stk.isEmpty() && stk.peek()<current)
        {
            stk.pop();
        }
        if(stk.isEmpty())
        System.out.println(-1);
        else
         System.out.println(stk.peek());
         stk.push(current);
    }

} 

public static void previoussmaller(int[] arr) 
{
    Stack<Integer>  stk=new Stack<>();
    for(int i=0;i<arr.length;i++)
    {
        int current=arr[i];
        while(!stk.isEmpty() && stk.peek()>current)
        {
            stk.pop();
        }
        if(stk.isEmpty())
        System.out.println(-1);
        else
         System.out.println(stk.peek());
         stk.push(current);
    }

}

public static void nextgreater(int[] arr) 
{
    Stack<Integer>  stk=new Stack<>();
    int[] ans=new int[arr.length];
    for(int i=arr.length;i<=0;i--)
    {
        int current=arr[i];
        while(!stk.isEmpty() && stk.peek()<current)
        {
            stk.pop();
        }
        if(stk.isEmpty())
        ans[i]=-1;
        else
         ans[i]=stk.peek();
         stk.push(current);
    }
    for(int i=arr.length;i>0;i++)
    {
        System.out.print(ans[i]+" ");
    }

}

public static void nextsmaller(int[] arr) 
{
    Stack<Integer>  stk=new Stack<>();
    int[] ans=new int[arr.length];
    for(int i=arr.length;i<=0;i--)
    {
        int current=arr[i];
        while(!stk.isEmpty() && stk.peek()>current)
        {
            stk.pop();
        }
        if(stk.isEmpty())
        ans[i]=-1;
        else
         ans[i]=stk.peek();
         stk.push(current);
    }
    for(int i=arr.length;i>0;i++)
    {
        System.out.print(ans[i]+" ");
    }

}
}
