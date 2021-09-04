import java.util.*;
public class directedUnweightedAdjList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of vertices and edges respectively:");
        int V = sc.nextInt();
        int E = sc.nextInt(); 
        
        List<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<V+1;i++)
        list.add(new ArrayList<Integer>());
        
        System.out.println("Enter (u,v) pairs:");
        for(int i=0;i<E;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            list.get(u).add(v);
            //list.get(v).add(u);
            
        }
        System.out.println("Adjacency List:");
        for(int i=1;i<V+1;i++)
        {
            System.out.print(i+" --> ");
            for(int j=0;j<list.get(i).size();j++)
            {
                if(j!=list.get(i).size()-1)
                System.out.print(list.get(i).get(j)+" , ");
                else
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }
}