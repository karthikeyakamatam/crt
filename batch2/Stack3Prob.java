import java.util.*;

public class Stack3Prob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().split(" ")[1];
        long res=0;
        for(char c:str.toCharArray())
        {
            res=res*10+(c-48);
        }
        System.out.println(res);
        sc.close();
    }
    
}
