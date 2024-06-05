import java.util.Scanner;
public class clinc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int i;
        String s;
        int collection=0;
        int ages[]= new  int[20];
        if(n>20)
        {
            for(i=0;i<20;i++)
            {
                s=sc.next();
                if(s.isEmpty())
                {
                    break;
                }
                else{
                    ages[i] = Integer.parseInt(s);
                }
            }
        }
        for(int j:ages)
        {
            if(j<=17)
             collection+=200;
             else if(j>17 & j<=40)
              collection+=400;
            else if(j>40 & j<120)
             collection+=300;
             else
               System.out.println("invalid age");


        }
    
    }
    
}
