import java.util.*;
class Meeting implements Comparable<Meeting>
{
    int start,finish;
    Meeting(int start,int finish)
    {
        this.start=start;
        this.finish=finish;
    }

    public int compareTo(Meeting next)
    {
       return this.finish - next.finish;
    }
    public String toString()
    {
        return "(" + start+","+finish+")";
    }

}
static int nmeetings(ArrayList<Meeting> meetings)
{
    int counter=0;
    Collections.sort(activities);
    Meeting selected=activities.get(0);
    System.out.println(selected);
    counter++;
    for(int i=1;i< activities.size();i++)
    {
        Meeting nextactivity= activities.get(i);
        if(nextactivity.start>selected.finish)
        {
            System.out.println(nextactivity);
            counter++;
            selected=nextactivity;
        }
        
    }

    return counter;
}
public class nmeetingroom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Meeting> activities=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int start=sc.nextInt();
            int finsh=sc.nextInt();
            activities.add(new Meeting(start,finsh));
        }
        System.out.println(findmaxactivity(activities));
    }
}
