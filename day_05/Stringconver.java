import java.util.Scanner;

public class Stringconver {
  static String encodeMessage(String message)
  {
    String answer="";
    for(int i=0;i<message.length();i++)
    {
        char ch=message.charAt(i);
        if(ch>=65 && ch<=90)  //to check whether it is alpahbet
        {
            int position=ch-64;
            int enc_position=91-position;
            answer =answer + (char)enc_position;
        }

    }
    return answer;
  }    
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(encodeMessage(s));
        sc.close();
  }
}
