
/*
 * given a number 'n 'increase the number by 1 wihtout using arithetmic operators
 * 
 */
import java.util.*;
public class increment_by {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=-(~n);
        System.out.println(n);
        //finding even or odd by using the bitwise opeartors
        if((n & 1)==1)
        {
          System.out.println("odd number");
        }
        else
        {
            System.out.println("even number");
        }
        
    }
}
