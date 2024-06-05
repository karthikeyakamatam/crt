import java.util.*;
public class shiftzero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string consisit of 0 and 1's ");
        String s=sc.nextLine();
        char chars[]=s.toCharArray();
        char chars2[]=new char[s.length()];
        int left=0,right=s.length()-1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(chars[i]=='0')
            {
                chars2[right--]=chars[i];
            }
            else
            {
                chars2[left++]=chars[i];
            }

        
        }
        String ns=new String(chars2);
        System.out.println("the new array is " +ns);
    }
}
