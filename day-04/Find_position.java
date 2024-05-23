import java.util.*;
public class  Find_position
{
    public static void Find_position1(int steps)
    {
    int x=0,y=0,distance=10;
    char direction='R';
    while(steps>0)
    {
        switch(direction)
        {
            case 'R' :x=x+distance;
                      direction='U';break;
            case 'U' : y=y+distance;
                     direction='L';break;
            case 'L': x=x-distance;
                     direction='D';break;
            case 'D': y=y-distance;
                     direction='R';break;
        }
        distance+=10;
        steps--;

        
    }
    System.out.println(x+" "+y);



  
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Find_position1(n);
        
    }
}
