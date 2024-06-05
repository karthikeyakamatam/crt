import java.util.*;
public class ladder {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();        
        int k=sc.nextInt();
       // System.out.println(countways(n,k));
       
       
       int[] buffer=new int[n+1]; 
       System.out.println(dpcountways(n, k, buffer));
        
        sc.close();
    }
    static int countways(int n,int k)
    {
        //base case
        if(n==0)
        return 1;
        if(n<0)
        return 0;

        //recursive case
        int answer=0;
        for(int jump=1;jump<=k;jump++)
        {
            answer=answer+countways(n-jump, k);
        }
        return answer;

    }


    static int dpcountways(int n,int k,int[] buffer)
    {
        //base case
        if(n==0)
        return 1;
        if(n<0)
        return 0;
        //check point
        if(buffer[n]!=0)
        return buffer[n];

        //recursive case
        int answer=0;
        for(int jump=1;jump<=k;jump++)
        {
            answer=answer+countways(n-jump, k);
        }
        buffer[n]=answer;
        return buffer[n];

    }
}
