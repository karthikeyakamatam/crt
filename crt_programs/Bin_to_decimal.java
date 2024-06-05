import java.util.*;
public class Bin_to_decimal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int dec=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                dec += Math.pow(2,s.length()-1-i);

            }
        }
        System.out.println(dec);
    }
}
