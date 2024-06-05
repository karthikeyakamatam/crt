/*
 * we want estimate the cost of painting a property interoir wall painting cost is rs 18 per sq.ft and exterior wall
 * paiinting is rs 12 per sq.ft.
 * 
 * take input as
 * 1.no of interior walls
 * 2. no of exterior walls
 * 3.sufraface of each interiow wall in units of square feet
 * 4.surface area of each exterior wall in units of square feet
 * 
 * if  user enters zero as the no of walls then skip surface3 area values as user may don;t want to paint the al
 * calucalte the dispaly the cost to tpaint the wall
 */
import java.util.Scanner;
public class paint_cost {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  n_interior = sc.nextInt();
        int n_exterior = sc.nextInt();
        int measuremnt,i,iamt=0,eamt=0,tamt=0;
        if(n_interior>0)
        {
        for(i=1; i<=(n_interior);i++)
        {
            measuremnt=sc.nextInt();
            iamt=measuremnt*18;
            tamt=tamt+iamt;
        }
        } 
        if(n_exterior>0)
        {
        for(i=1; i<=(n_exterior);i++)
        {
            measuremnt=sc.nextInt();
            eamt=measuremnt*18;
            tamt=tamt+eamt;
        }
        } 
        

    }
}
