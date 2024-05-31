/*
 * given an array of integers of length N that represents prices of stock on N consecutive days.
 * find the span of stock's price of all N days .
 */


 import java.util.*;
 public class stock {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] prices=new int[n];
     for(int i=0;i<n;i++)
     {
         prices[i]=sc.nextInt();
     }
     sc.close();
     stockspan(prices);
 }
 public static void stockspan(int[] prices) 
 {
     Stack<Integer>  stk=new Stack<>();
    
     
     for(int idx=0;idx<prices.length;idx++)
     {
         
         while(!stk.isEmpty() && prices[stk.peek()]<prices[idx])
         {
             stk.pop();
            
         }
         if(stk.isEmpty())
         System.out.print((idx+1) + " ");
         else
          System.out.print((idx-stk.peek())+" ");
          stk.push(idx);
          
     }
 
 } 
}