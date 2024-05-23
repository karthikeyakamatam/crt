import java.util.*;
public class Bit_wise {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a & b);
        System.out.println(a |b );
        System.out.println(a^b);
        System.out.println(~a);

        System.out.println(a<<b); // left shifty means mutliplying by 2 (since covert number int binary and shift the digits by ont two left)
        System.out.println(a*Math.pow(2,b));
        System.out.println(a>>b);// right shift means divie by 2
        System.out.println(a*Math.pow(2,-b));
        System.out.println();
    }
}
