import java.util.*;
public class StringmethodDEmo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char [] chars=s.toCharArray();
        char [] newchar =new char[s.length()];
        for(int i=0;i<s.length();i++)
        {  
            if(Character.isUpperCase(chars[i]))
            {
            switch(chars[i])
            {
                case 'A':
                  newchar[i]='Z';break;
                case 'B':
                   newchar[i]='Y';break;
                case 'C':
                   newchar[i]='X';break;
                case 'D':
                   newchar[i]='W';break;
                case 'E':
                   newchar[i]='V';break;
                case 'F':
                   newchar[i]='U';break;
                   case 'G':
                   newchar[i]='T';break;
                   case 'H':
                   newchar[i]='S';break;
                   case 'I':
                   newchar[i]='R';break;
                   case 'J':
                   newchar[i]='Q';break;
                   case 'K':
                   newchar[i]='P';break;
                   case 'L':
                   newchar[i]='O';break;
                   case 'M':
                   newchar[i]='N';break;
                   case 'N':
                   newchar[i]='M';break;
                   case 'O':
                   newchar[i]='L';break;
                   case 'P':
                   newchar[i]='K';break;
                   case 'Q':
                   newchar[i]='J';break;
                   case 'R':
                   newchar[i]='I';break;
                   case 'S':
                   newchar[i]='H';break;
                   case 'T':
                   newchar[i]='G';break;
                   case 'U':
                   newchar[i]='F';break;
                   case 'V':
                   newchar[i]='E';break;
                   case 'W':
                   newchar[i]='D';break;
                   case 'X':
                   newchar[i]='C';break;
                   case 'Y':
                   newchar[i]='B';break;
                   case 'Z':
                   newchar[i]='A';break;

            }
        }
        else
        {
            newchar[i]=chars[i];
        }

    }
    String p=newchar.toString();
    System.out.println(p);
}
}