import java.util.*;
public class removeindex {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no.of elements ");
        int n= sc.nextInt();
        int a[]=new int[n];
        int j,i;
        System.out.println("enetr the elements ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the index value of the number ");
        j=sc.nextInt();
        int narr[]=new int[a.length-1];
        int k;
        if (j>=n)
        {
            System.out.println("invalid index");
            
        }
        else{
            for(i=0,k=0;i<n;i++)
            {
                if(j==i)
                {
                    continue;
                }
                narr[k++]=a[i];
            }
        }
        for(i=0;i<narr.length;i++)
        {
            System.out.print(narr[i]+" ");
        }

    }
}
