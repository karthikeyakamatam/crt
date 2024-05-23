/*
 * given 2 integers 'n' and 'k' check whether kTH bit of 'n' is set or unset
 */
import java.util.*;
public class set_unsetbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int mask=1;
        mask=(mask<<k);
        if((n&mask)==0)
        {
            System.out.println("the bit is unset bit");
        }
        else{
            System.out.println("it is set bit");

        }
        clerabit(n,k);
        setkbit(n,mask);
        clearrightbit(n);
    }
    static void setkbit(int n,int mask)
    {
         //set the kth bit ()
         n=(n|mask);
         System.out.println(n);
    }
    static void clerabit(int n,int k)
    {
        
        n=n & (~(1<<k));
        System.out.println(n);

    }
    /* 
     * given an integer 'n' task is clear the rightmost set bit n
     * simple solution is N&(N-1) 
    */
    static void clearrightbit(int n)
    {
        System.out.println(n&(n-1));
        if((n&(n-1))==0)
        {
            System.out.println("power of 2");
        }
    }
}
