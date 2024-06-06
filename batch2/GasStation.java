public class GasStation {
   static int findTour(int gas[],int cost[])
   {
    int totalGas=0;
    int totalCost=0;
    int tank=0;
    int index=0;
    for(int i=0;i<gas.length;i++)
    {
        totalGas+=gas[i];
        totalCost+=cost[i];
        tank+=gas[i]-cost[i];
        //if tank value os neg, restet our start point index
        if(tank<0)
        {
            index=i+1;
            tank=0;
        }
    }
    if(totalCost>=totalCost)
    {
        return index;
    }
    else{
        return -1;
    }
    
   }
    public static void main(String[] args) {
        int gas[]={2,4,2};
        int cost[]={3,6,3};
        System.out.println(findTour(gas,cost));
    }
}
