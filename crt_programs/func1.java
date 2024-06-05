import java .util.*;
public class func1 {
    static int calc(int v)
    {
        if(v==1 || v==0)
         return 1;
        if(v%2==0)
        return calc(v/2)+2;
        else
        return calc(v-2)+3;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        int a=calc(n);
        System.out.println(a);
    }
}
