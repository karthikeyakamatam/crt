import java.util.*;
public class canday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] candies=new int[n];
        for(int i=0;i<n;i++)
        candies[i]=sc.nextInt();
        sc.close();
        shopcandies(candies,k);

    }
    static void shopcandies(int[] candies, int k)
    {
        Arrays.sort(candies);
        int start=0,end=candies.length-1;
        int minspend=0,maxspend=0;
        while(start<=end)
        {
            minspend=minspend+candies[start];
            start++;
            end=end-k;
        }
        start=0;
        end=candies.length-1;
        while(start<=end)
        {
            maxspend=maxspend+candies[end];
            end--;
            start+=k;

        }
        System.out.println("max spend is : "+maxspend+" and min spend is:"+ minspend);
    }
}
 