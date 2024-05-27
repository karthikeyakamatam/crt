/*
 * given a list of 'n' integers in ascending order and an integr k.
 * your task is to find the lower bound of k in array in the list.
 * lower bound means -- is the element which is equal or nearest larger element of k
 * upper bound means -- nearest larger number (equal number is not included)
 * examle : 12 22 45 80 100 176 200
 *         lower bound of 80 [80,100,176,200] in this complete range the lowest element ans is 80
 *         lower bound of 75 [80,100,176,200] in this complete range the lowest element ans is 80
 *         upper bound of 80 [100,176,200] in this complete range the lowest element ans is 100
 *  *we can also get the frequency of a number using a formula----->>(upper bound - lower bound)
 * 2.Q : given a list of n sorted integers abd an integer k.
 *      your taswk is find frequnecy of k in the list
 */
import java.util.*;
public class prob1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(lb(ar,key));
    }

    public  static int lb(int[] ar, int key) 
    {
        int low=0,high=ar.length-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
        if(key<=ar[mid])
        {
            return mid;
        }
        else if(key<ar[mid])
        {
            high=mid-1;
            
        }
        else
        {
            low=mid+1;
        }
         }
         return -1;

    }
    public static int upperbound(int[] ar,int key)
    {
    int low=0,high=ar.length-1;
        int answer;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
        if(key==ar[mid])
        {
            answer=mid+1;
        }
        else if(key<ar[mid])
        {
            high=mid-1;
            
        }
        else
        {
            low=mid+1;
        }
         }
         return answer;

    }
    static int frequency(int[] arr,int k)
    {
        int lowerbound=lb(arr, k);
        int upperbound1=upperbound(arr, k);
        return upperbound1-lowerbound; 
    }
}