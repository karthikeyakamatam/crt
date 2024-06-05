import java.util.*;
public class revarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[20];
        System.out.println("enter the number of elements in the arary");
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
