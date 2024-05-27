import java.util.*;
/**
 * linear_search
 */
public class linear_search {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
       int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println(linear_search1(ar,key));
    }
public static int linear_search1(int[]ar ,int key)
{
    for(int i =0;i<ar.length;i++)
    {
        if(key==ar[i])
        {
            return i;
        }
    }
    return -1;
}

}