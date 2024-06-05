/*
 * spy number --- the number which sum of digits == product of digits
 */
import java.util.*;
public class spynum {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0,prod=1,temp,j,p=n,m=n;
        while(n!=0)
        {
            j=n%10;
            sum+=j;
            n=n/10;
        }
        System.out.println(m);
        while(m!=0)
        {
            temp=m%10;
            prod=prod*temp;
            m=m/10;
        }
        if(prod==sum)
        System.out.println(p+ " is a spy number");
        else
        System.out.println(p + " is not a spy number");

    }
}
