import java.util.*;
public class crt_pattr1 {
    public static void pat(int nr, int nc)
    {
        int r,c;
        for(r=1;r<=nr;r++)
        {
            for(c=1;c<=nc;c++)
            {
                System.out.print("* ");
                
            }
            nc-=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  no of rows and columns");
        int nr=sc.nextInt();
        int nc=sc.nextInt();
        pat(nr, nc);


    }
}
