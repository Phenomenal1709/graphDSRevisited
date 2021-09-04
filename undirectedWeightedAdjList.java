import java.util.*;
public class undirectedWeightedAdjList
{
    static class Pair
    {
        int second_vertex;
        int cost;
        Pair(int second_vertex,int cost)
        {
            this.second_vertex=second_vertex;
            this.cost=cost;
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of vertices and edges respectively respectively:");
        int V = sc.nextInt();
        int E = sc.nextInt();
        
        List<ArrayList<Pair>> list = new ArrayList<>();
        
        for(int i=0;i<V+1;i++)
        list.add(new ArrayList<Pair>());
        
        System.out.println("Enter (u,v) pairs along with their cost:");
        for(int i=0;i<E;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int cost = sc.nextInt();
            
            list.get(u).add(new Pair(v,cost));
            list.get(v).add(new Pair(u,cost));
        }
        System.out.println("Adjacency List:");
        for(int i=1;i<V+1;i++)
        {
            System.out.print(i+" --> ");
            
            for(int j=0;j<list.get(i).size();j++)
            {
            if(j!=list.get(i).size()-1)
            System.out.print("("+list.get(i).get(j).second_vertex+","+list.get(i).get(j).cost+") , ");
            else
            System.out.print("("+list.get(i).get(j).second_vertex+","+list.get(i).get(j).cost+")");
            }
            
            System.out.println();
        }
    }
}