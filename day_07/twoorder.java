import java.util.*;
public class twoorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(sortedRotated(a, key));
    }
    static int sortedRotated(int[] a,int key)
    {
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(key==a[mid])
            {
                return mid;
            }
            else if(a[mid]>=a[low])  //it is on first line
            {
                if(key>=a[low] && key<a[mid])
                {
                    high=mid-1;

                }
                else
                {
                    low=mid+1;
                }

            }
            else               // it is on second line
            {
                if(key>a[mid] && key<a[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }

            }
        }
        return -1;
    }

}
