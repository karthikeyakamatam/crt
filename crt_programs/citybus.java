/*
 * a city bus is a ring sroutre bus which runsin circular fashion that is , bus once starts at the source bus stop,
 * stop in its route and at the end it reaches the soucre bus stop again.
 * if there are n number of stps and if the bus starts at bus top 1, then after nth bus stop , the next stop in the route
 * will be Bus stop number 1 always
 * if there are n stops there will be n paths one path connects two stops distances (in meters) for all paths om ring route is
 * given in array path[]
 * as given below:
 * path=[800,600,750,900,1400,1200,1100,1500]
 * fare is determinede based on the distance covered from source to destinatioj stop aws distance between
 * input source and destination stops
 *can be measured by looking at the vlaues in array path[] and fare can be calculated as per following criteria:
   if d=1000 meters then fare=5 INr
   (when calculating fare for others  the calculated )
 */
import java.util.*;
public class citybus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sources: ");
        String source =sc.nextLine();
        System.out.println();
    }
}
