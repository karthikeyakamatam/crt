import java.util.*;
public class collectingballs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] road1=new int[n];
        int[] road2=new int[m];
        for(int i=0;i<n;i++)
        road1[i]=sc.nextInt();
        for(int j=0;j<m;j++)
        road2[j]=sc.nextInt();
        System.out.println(colectmaxballs(road1,road2));
        sc.close();
    }
     static int colectmaxballs(int[] road1, int[] road2)
      {
        int collected=0;
        int n=road1.length,m=road2.length;
        int idxA=0 ,idxB=0;
        int road1sum=0 ,road2sum=0;
        while(idxA<n && idxB<m)
        {
            while(idxA+1<n  && road1[idxA]==road1[idxA+1])
            {
                road1sum+=road1[idxA++];
            }
            while(idxB+1<m && road2[idxB]==road2[idxB])
            {
                road2sum+=road2[idxB++];

            }
            if(road1[idxA]==road2[idxB])
            {
                collected+=Math.max(road1sum,road2sum)+road1[idxA];
                road1sum=road2sum=0;
                idxA++;idxB++;
            }
            else if(road1[idxA]<road2[idxB])
            {
                road1sum+=road1[idxA++];

            }
            else
            {
                road2sum+=road2[idxB++];
            }
        }
        while(idxA<n)
        {
            road1sum+=road1[idxA++];
        }
        while(idxB<m)
        {
            road2sum+=road2[idxB++];
        }
        collected+=Math.max(road2sum, road1sum);
        return collected;
      }
    
}






























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































