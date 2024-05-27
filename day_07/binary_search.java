import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(bisearch(ar, key));

    }

  public  static int bisearch(int[] ar, int key) 
    {
        int low=0,high=ar.length-1;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
        if(key==ar[mid])
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
}
