import java.util.*;
class Job implements Comparable<Job>
{
    int deadline,profit;
    Job(int deadline,int profit)
    {
        this.deadline=deadline;
        this.profit=profit;
    }

    public int compareTo(Job next)
    {
       return this.profit - next.profit;
    }
    public String toString()
    {
        return "(" + deadline+","+profit+")";
    }

}

public class jobshedule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Job> jobs=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int deadline=sc.nextInt();
            int profit=sc.nextInt();
            jobs.add(new Job(deadline,profit));
        }
        System.out.println(findmaxprofit(jobs));
    }
    static int findmaxprofit(ArrayList<Job> jobs)
{
    int finalprofit=0;
    Collections.sort(jobs, Collections.reverseOrder());
    boolean[] slots=new boolean[jobs.size()];
  
     for(Job currentjob: jobs)
     {
        int currentDeadLine= currentjob.deadline;
        int currentprofit= currentjob.profit;
        for(int currentslot=currentDeadLine-1;  currentslot>=0; currentslot--)
        {
            if(slots[currentslot]==false)
            {
                finalprofit+=currentprofit;
                slots[currentslot]=true;
                break;
            }
        }
     }
   return finalprofit;
}
}
