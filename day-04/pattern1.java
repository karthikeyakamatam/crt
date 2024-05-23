import java.util.*;
public class pattern1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //square(n);
    //increasing(n);
    //decreasing(n);
    //triangle(n);
    //hill_1(n);
    //diamond(n);
    //newpatt(n);
    //stringpatt(s);
    //h_square(n);
    //newfig(n);
    fountainpatt(n);

    sc.close();
}

static void square(int n)
{
    for(int row=1;row<=n;row++)
    {
    for(int col=1;col<=n;col++)
    {
        System.out.print('*'+" ");
    }
    System.out.println();
}
}
static void increasing(int n)
{
    for(int row=1;row<=n;row++)
    {
    for(int col=1;col<=row;col++)
    {
        System.out.print('*'+" ");
    }
    System.out.println();
}
}
static void decreasing(int n)
{
    for(int row=1;row<=n;row++)
    {
        for(int col=n;col>=row;col--)
        {
            System.out.print('*'+" ");
        }
        System.out.println();
    }
}
static void triangle(int n)
{
    for(int row=1;row<=n;row++)
    {
        //decreasing with spaces
        for(int col=row;col<=n-1;col++)
        {
            System.out.print("  ");
        } 
        //increasing triangle
        for(int col=1;col<=row-1;col++)
        {
            System.out.print('*'+" ");
        }
        for(int col=1;col<=row;col++)
        {
            System.out.print('*'+" ");
        }

        System.out.println();
    }
}
static void hill_1(int n)
{
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=row;col++)
        System.out.print('*'+" ");
        for( int col=row; col<=n-1;col++)
        System.out.print("  ");
        for(int col=1;col<=row;col++)
        System.out.print('*'+" ");
        System.out.println();
        
    }
}
static void diamond(int n)
{
    for(int row=1;row<=n-1;row++)
    {
        for(int col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(int col=1;col<=row-1;col++)
        {
            System.out.print('*'+" ");
        }
        for(int col=1;col<=row;col++)
        {
            System.out.print('*'+" ");
        }
        System.out.println();
    }
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(int col=row;col<=n;col++)
        {
            System.out.print('*'+" ");
        }
        for(int col=row;col<=n;col++)
        {
            System.out.print('*'+" ");
        }
        System.out.println();

    }
}
static void newpatt(int n)
{
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=row;col++)
        {
            System.out.print('*'+" ");
        }
        for(int col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(int col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(int col=1;col<=row;col++)
        {
            System.out.print("  ");
        }

        System.out.println();
    }
    for(int row=1;row<=(n*2+2);row++)
    {
       System.out.print('*'+" ");
    }
    System.out.println();
    for(int row=1;row<=n;row++)
    {
        for(int col=row;col<=n;col++)
        {
            System.out.print("  ");
        }
        for(int col=1;col<=row;col++)
        {
            System.out.print("  ");
        }for(int col=1;col<=row;col++)
        {
            System.out.print("  ");
        }
        for(int col=row;col<=n;col++)
        {
            System.out.print('*'+" ");
        }
        System.out.println();
    } 
}
static void stringpatt(String chars)
{
    int n=chars.length();

    for(int row=1;row<n;row++)
    {
        for(int col=row;col<=n;col++)
        {
            System.out.print(" - ");
        }
        for(int col=1;col<=row;col++)
        {
            
        }
        System.out.println();
    }

}
static void h_square(int n)
{
    for(int row=1;row<n;row++)
    {
        for(int col=1;col<=n;col++)
        {
            if(row==1 || col==1 || col==n || row==n)
            {
                System.out.print("*"+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
static void  cross(int n)
{
    for(int row=1;row<=n;row++)
    {
        
    }
}
static void newfig(int n)
{
    for(int row=1;row<=n-1;row++)
    {
        for(int col=1;col<=n;col++)
        {
            if(col==1||(col==row))
            {
                System.out.print("*"+" ");
            }
            else{
                System.out.print("  ");
            }
        }

        System.out.println();
    }
    for(int row=1;row<=n;row++)
    {
        System.out.print("* ");
    }
    System.out.println();
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=n;col++)
        {
            if(col==1||(col+row==n))
            {
                System.out.print("*"+" ");
            }
            else{
                System.out.print("  ");
            }
        }

        System.out.println();
    }
}
static void fountainpatt(int n)
{
    for(int row=1;row<=n-1;row++)
    {
        for(int col=1;col<=n-1;col++)
        {
            if(col==row)
            {
                System.out.print(row+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        for(int col=1;col<=n;col++)
        {
            if((col+row)==n+1)
            {
                System.out.print(row+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();

    }
    for(int row=1;row<=n;row++)
    {
        for(int col=1;col<=n-1;col++)
        {
            if(col+row==n+1)
            {
                System.out.print(n-);
            }
            else{
                System.out.print("  ");
            }
        }
        for(int col=1;col<=n;col++)
        {
            if((col+row)==n+1)
            {
                System.out.print(row+" ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();

    }
}
}
