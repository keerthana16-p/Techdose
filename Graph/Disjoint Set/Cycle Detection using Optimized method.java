//Cycle Detection in an Undirected Graph--> Disjoint Set
import java.util.*;
public class Main
{   
    static int[] parent;
    static int[] rank;
    //Find operation by Path Compression
    public static int find(int v){
        if(parent[v]==-1){
            return v;
        }
        return parent[v]=find(parent[v]);
    }
    //Union operation by union by rank
    public static void union(int from,int to){
        from = find(from);//To find the absolute root
        to = find(to);
        if(rank[from]<rank[to]){
            parent[from]=to;
        }
        else if(rank[from]>rank[to]){
            parent[to]=from;
        }
        else{
            parent[from]=to;//both ranks are equal then increase the rank
            rank[to]++;
        }
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
		int[][] edges = {{0,1},{2,3},{1,2},{0,4}};
		int vertices = 5;
		parent = new int[vertices];
		rank = new int[vertices];
		Arrays.fill(parent,-1);
		Arrays.fill(rank,0);
		if(isCyclic(edges)){
		    System.out.println("The graph contains the cycle");
		}
		else{
		    System.out.println("The graph does not contain a cycle");
		}
	}
}
