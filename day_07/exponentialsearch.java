import java.util.*;
public class exponentialsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        sc.close();
        System.out.println(exp(ar, key));

    }

  public  static int exp(int[] ar, int key) 
    {
        if(key==ar[0])
        {
            return 0;
        }
        int i=1;
        int start=0;
        while(i<ar.length)
        {
        if(key==ar[i])
        {
            return i;
        }
        else if(key>ar[i])
        {
           start=i+1;
           i=i*2;
        }
        else
        {
            break;
        }
         }
         for(int idx=start;idx<ar.length && idx<i;idx++)
         {
            if(key==ar[idx])
            {
            return idx;
         }
        }
         return -1;

    }
}


