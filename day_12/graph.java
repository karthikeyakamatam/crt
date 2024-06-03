import java.util.*;
class GraphDS
{
    Map<Integer ,ArrayList<Integer>> graph;
    GraphDS()
    {
        graph= new HashMap<>();
    }
    void addEdge(int source , int destination)
    {
        graph.putIfAbsent(source,new ArrayList<Integer>());
        graph.putIfAbsent(destination, new ArrayList<Integer>());
        graph.get(source).add(destination);
       // graph.get(destination).add(source);  for undirected

    }

    void addWeightEdge(int source , int destination)
    {
        graph.putIfAbsent(source,new ArrayList<Integer>());
        graph.putIfAbsent(destination, new ArrayList<Integer>());
        graph.get(source).add(destination);
       

    }
    void bfs(int start)
    {
        Queue<Integer> queue =new ArrayDeque<>();
        Map<Integer,Boolean> isvisited= new HashMap<>();
        for(int vertex:graph.keySet())
        {
            isvisited.put(vertex,false);
        }
        queue.offer(start);
        isvisited.put(start, true);
        while(!queue.isEmpty())
        {
            int temp=queue.peek();
            for(int nbr:graph.get(temp))
            {
                if(!isvisited.get(nbr))
                {
                    queue.offer(nbr);
                    isvisited.put(nbr,true);
                }
            }
            System.out.print(queue.poll()+" ");
        }

    }

    void finddistance(int start)
    {
        Queue<Integer> queue =new ArrayDeque<>();
        Map<Integer,Boolean> isvisited= new HashMap<>();
        Map<Integer,Integer> distance= new HashMap<>();
        for(int vertex:graph.keySet())
        {
            isvisited.put(vertex,false);
            distance.put(vertex,0);
        }
        queue.offer(start);
        isvisited.put(start, true);
        distance.put(start, 0);
        while(!queue.isEmpty())
        {
            int temp=queue.peek();
            for(int nbr:graph.get(temp))
            {
                if(!isvisited.get(nbr))
                {
                    distance.put(nbr,temp+1);
                    queue.offer(nbr);
                    isvisited.put(nbr,true);
                }
            }
            queue.poll();
        }
    }
    void dfsHelper(int current,Map<Integer,Boolean> isvisited)
    {
        isvisited.put(current,true);
        System.out.print(current+" ");
        for(int nbr:graph.get(current))
        {
            if(!isvisited.get(nbr))
            {
                dfsHelper(nbr, isvisited);
            }
        }
    }
    void dfs(int start)
    {
        Map<Integer,Boolean> isvisited =new HashMap<>();
        for(int vertex:graph.keySet())
        {
            isvisited.put(vertex, false);
            dfsHelper(start,isvisited);
        }
    }
    
    void print()
    {
        for(int vertex:graph.keySet())
        {
            System.out.println(vertex+ ":"+graph.get(vertex));
        }
    }
    boolean iscyclic()
    {
        Map<Integer,Boolean> isvisited =new HashMap<>();
        for(int vertex:graph.keySet())
        isvisited.put(vertex,false);
        int start=(int) graph.keySet().toArray()[0];

    return dfscyclicHelper(start,isvisited,-1);    
    }
    boolean dfscyclicHelper(int current,Map<Integer,Boolean> isvisited, int parent)
    {
        isvisited.put(current,true);
        for(int nbr: graph.get(current))
        {
            if(!isvisited.get(nbr))
            {
                boolean found_cycle= dfscyclicHelper(nbr, isvisited, current);
                if(found_cycle)
                return true;

            }
            else if(nbr!=parent)
            {
                return true;

            }
        }
        return false;
    }

}

class Graph
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        GraphDS g= new GraphDS();
       // g.addEdge(1, 2);
       // g.addEdge(1, 3);
       // g.addEdge(2, 3);
       // g.addEdge(2, 4);
       // g.addEdge(3, 5);
       // g.print();


        int n=sc.nextInt();
        while(n>0)
        {
            int src=sc.nextInt();
            int dest=sc.nextInt();
            g.addEdge(src, dest);
            n--;
        }
        g.print();
        g.bfs(3);
        System.out.println();
        g.dfs(3);
        sc.close();
        System.out.println(iscyclic());
    }
}