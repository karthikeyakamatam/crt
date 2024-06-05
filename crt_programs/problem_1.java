/*
 a dcotor has a clinc where he sreves his patients .teh doctors conslutaion fees are differenet for diff age groups 
 
 
 age should be between 0 and 120
 doctor consl=ult 20 per day* 
 */

import java.util.*;
public class problem_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ages of 20 pateints");
        int i;
        int a[]=new int[20];
        for(i=0;i<20;i++)
        {
        
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<20;i++)
        {
            if(a[i]<17)
            {
                System.out.println( "th fees of "+a[i]+ "is 200");
            }
            else if((a[i]>17)&(a[i]<40))
            {
                System.out.println("the fees of "+a[i]+ "is 400");
            }
            else if ((a[i]>40)&(a[i]<120)) {
                System.out.println("the fees of "+a[i]+ "is 200");
                
            }
            else 
            {
                System.out.println("the age of "+a[i]+"is in apporipriate");
            }
        }
    }
}
