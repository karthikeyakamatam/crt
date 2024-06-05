import java.util.*;
public class twopinter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int left=0,right=n-1,temp;
        while(left<right)
        {
            temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
