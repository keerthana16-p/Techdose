//Cycle Detection in an Undirected Graph--> Disjoint Set
import java.util.*;
public class Main
{   
    static int[] parent;
    public static int find(int v){
        if(parent[v]==-1){
            return v;
        }
        return find(parent[v]);
    }
    public static void union(int from,int to){
        from = find(from);//To find the absolute root
        to = find(to);
        parent[from]=to;
    }
    public static boolean isCyclic(int[][] edges){
        for(int i=0;i<edges.length;i++){
            int from = find(edges[i][0]);
            int to = find(edges[i][1]);
            if(from==to){
                return true;
            }
            union(from,to);
        }
        return false;
    }
	public static void main(String[] args) {
		int[][] edges = {{0,1},{0,3},{2,3},{1,2}};
		int vertices = 4;
		parent = new int[vertices];
		Arrays.fill(parent,-1);
		if(isCyclic(edges)){
		    System.out.println("The graph contains the cycle");
		}
		else{
		    System.out.println("The graph does not contain a cycle");
		}
	}
}
