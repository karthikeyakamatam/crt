/*
 * given infinite supply of the following coins denominatoes.
 *   10,5,2,1
 * you also given a target amount N, find the minimum number of coins required for the target amount
 */
import java.util.*;
public class coinProb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();

        System.out.println(mincoinsrequired(target));
    }
    static int mincoinsrequired(int target)
    {
        int [] denominations ={10,5,2,1};
        int counter=0;
        for(int currentcoin:  denominations)
        {
            if(target>=currentcoin)
            {
                int howmany=target/currentcoin;
                counter+=howmany;
                target=target-(currentcoin*howmany);

            }
            if(target==0)
            {
                break;
            }
        }
        return counter;
    }
}
