import java.util.*;
public class undirectedUnweightedAdjMat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of vertices and edges respectively:");
        int V = sc.nextInt();
        int E = sc.nextInt();
        
        int adj[][] = new int[V+1][V+1];
        
        System.out.println("Enter (u,v) pairs:");
        for(int i=0;i<E;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            
            adj[u][v]=1;
            adj[v][u]=1;   //Since the graph is undirected
        }
        System.out.println("Adjacency Matrix:\n");
        System.out.print("   ");
        for(int i=0;i<V+1;i++)
        System.out.print(i+" ");
        System.out.println();
        
        for(int i=0;i<V+1;i++)
        {
        System.out.print(i+"  ");    
        for(int j=0;j<V+1;j++)
        System.out.print(adj[i][j]+" "); 
        
        System.out.println();
        }
    }
}