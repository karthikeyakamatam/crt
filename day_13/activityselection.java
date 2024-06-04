import java.util.*;
class activity implements Comparable<activity>
{
    int start,finish;
    activity(int start,int finish)
    {
        this.start=start;
        this.finish=finish;
    }

    public int compareTo(activity next)
    {
       return this.finish - next.finish;
    }
    public String toString()
    {
        return "(" + start+","+finish+")";
    }

}

public class activityselection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<activity> activities=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int start=sc.nextInt();
            int finsh=sc.nextInt();
            activities.add(new activity(start,finsh));
        }
        System.out.println(findmaxactivity(activities));
    }
    static int findmaxactivity(ArrayList<activity> activities)
{
    int counter=0;
    Collections.sort(activities);
    activity selected=activities.get(0);
    System.out.println(selected);
    counter++;
    for(int i=1;i< activities.size();i++)
    {
        activity nextactivity= activities.get(i);
        if(nextactivity.start>=selected.finish)
        {
            System.out.println(nextactivity);
            counter++;
            selected=nextactivity;
        }
        
    }

    return counter;
}
}
