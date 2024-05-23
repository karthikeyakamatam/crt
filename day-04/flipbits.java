import java.util.*;
public class flipbits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=a^b,count=0;
        while(n!=0)
        {
            count++;
            n=n&(n-1); //removing right most significant bit of 1
        }
       System.out.println("no.of flips requires is count "+ count); 
    }
}
