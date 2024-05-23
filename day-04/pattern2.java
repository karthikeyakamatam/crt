import java.util.*;
public class pattern2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    hill_1(n);
}




static void hill_1(int n)
{
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=row;col++)
        System.out.print('*'+" ");
    }
}
}
