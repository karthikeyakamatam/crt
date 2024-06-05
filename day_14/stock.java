/*
 * given a stock prices for n days your task is find the max profit for by the stock and sell the stock such that you will get max profit
 * but you are allowed to buy or sell only one time 
 * example:  input- 6
 *              6 4 1 3 2 5
 *           output:4
 */
import java.util.*;
public class stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] prices=new int[n];
       for(int i=0;i<n;i++)
       {
        prices[i]=sc.nextInt();

       }
       //System.out.println(findmaxprofit(prices));
       System.out.println(dpfindmaxprofit(prices));
    
    }

    static int dpfindmaxprofit(int[] prices)
    {
        int finalprofit=0;
        int min=prices[0];

        for(int i=1;i<prices.length;i++)
        {
            int currentprofit=prices[i]-min;
            finalprofit=Math.max(finalprofit,currentprofit);
            min=Math.min(min,prices[i]);
        }
        return finalprofit;


    }
    static int findmaxprofit(int[] prcies)
    {
        int maxprofit=0;
        
        for(int i=0;i<prcies.length;i++)
        {
            int profit=0;
            for(int j=i+1;j<prcies.length;j++)
            {
                if(prcies[j]>prcies[i])
                {
                    profit=Math.max(profit,prcies[j]-prcies[i]);
                }

            }
            maxprofit=Math.max(profit,maxprofit);

        }
        return maxprofit;
    }
}
