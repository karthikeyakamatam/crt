import java.util.*;
public class minCostPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] costs= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                costs[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(mincostofpath(costs,x,y));

    }
    static int mincostofpath(int[][] costs,int x ,int y)
    {
        int rows=costs.length,cols=costs[0].length;
       int [][] ans=new int[rows][cols];
        for(int i=rows-1;i>=0;i--)
        {
            for(int j=cols-1;j>=0;j--)
            {
                if(i==rows-1 && j==cols-1)
                {
                    ans[i][j]=costs[i][j];

                }
                else if(i==rows-1)
                {
                    ans[i][j]=costs[i][j]+ans[i][j+1];
                }
                else if(j==cols-1)
                {
                    ans[i][j]=costs[i][j]+ans[i+1][j];
                }
                else
                {
                    ans[i][j]=costs[i][j]+Math.min(ans[i][j+1],ans[i+1][j]);
                }



            }
        }
        return ans[x][y];
    }
}
