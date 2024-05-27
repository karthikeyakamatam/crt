/*
 * JUMP SEARCH--
 *   intially we start with 0 index and take a jump=sqroot(n)
 * complexity sqrt(n)log n 
 */

import java.util.Scanner;

public class jumpsearch {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
      
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(jumpS(ar,key));
    }
public static int jumpS(int[]ar ,int key)
{
    int i=0;
    int jump=(int)(Math.sqrt(ar.length));
    int start=i;
    while(i<ar.length)
    {
        if(key==ar[i])
        {
            return i;
        }
        else if(key>ar[i])
        {
            start=i+1;
            i=i+jump;
            if(i>=ar.length)
            {
                break;
            }
        }
        else 
        {
            break;
        }
    }
    i= i>=ar.length  ? ar.length :i;
    for(int idx=start;idx<i;idx++)
    {
        if(key==ar[idx])
        {
            return idx;
        }
    }

    return -1;
}
}
