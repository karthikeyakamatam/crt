import java.util.*;
public class fibo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int[] buffer=new int[n+1];
        //System.out.println(dpgetfibo(n,buffer));
        System.out.println(bottomdpgetfibo(n));
        sc.close();
    }
    static int getfibo(int n)
    {
        if(n==0 || n==1)
        return n;
        else
        return getfibo(n-1)+getfibo(n-2);
    }
    static int dpgetfibo(int n,int[] buffer)
    {
        //top down appproach (mainly uses the recursion concept)
        if(n==0 || n==1)
        return n;
        if(buffer[n]!=0)
        {
            return buffer[n];
        }
        else
       buffer[n]= dpgetfibo(n-1,buffer)+dpgetfibo(n-2,buffer);

       return buffer[n];
    }
    static int bottomdpgetfibo(int n)
    {
        int[] buffer=new int[n+1];
        buffer[0]=0;
        buffer[1]=1;
        for(int count=2;count<=n;count++)
        {
            buffer[count]=buffer[count-1]+buffer[count-2];
        }
        return buffer[n];
    }
}