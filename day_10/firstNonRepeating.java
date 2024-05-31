import java.util.*;
public class firstNonRepeating {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    firstNonrepeating(s);
}   
static void firstNonrepeating(String str)
{
    HashMap<Character,Integer> frequency=new HashMap<>();
    ArrayDeque<Character> queue = new ArrayDeque<>();
    for(int i=0;i<str.length();i++)
    {
        char current=str.charAt(i);
        queue.offer(current);     //step1 
        frequency.putIfAbsent(current,0);  //step2
        frequency.put(current,frequency.get(current)+1);  //step3
        while(!queue.isEmpty() && frequency.get(queue.peekFirst())>1)
        {
            queue.pollFirst();
        }
        if(queue.isEmpty())
        {
            System.out.print(-1+ " ");
        }
        else
        {
           System.out.print( queue.peekFirst()+" ");
        }

    }

} 
}
