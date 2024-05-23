
import java.util.*;
public class signcheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a^b)<0)
        {
            System.out.println("opposite signed numbers");
        }
        else
        {
            System.out.println("same signed numbers");
        }
    }
    
}
