import java.util.*;
public class Main
{   
    static int v;
    static int[] parent;
    static int[] rank;
    public static int find(int vertex){
        if(parent[vertex]==-1){
            return vertex;
        }
        return parent[vertex]=find(parent[vertex]);
    }
    public static void union(int from,int to){
        if(rank[from]<rank[to]){
            parent[from]=to;
        }
        else if(rank[to]<rank[from]){
            parent[to]=from;
        }
        else{
            parent[from]=to;
            rank[to]++;
        }
    }
    public static void findMST(int[][] graph){
        List<List<Integer>> list = new ArrayList<>();
        parent = new int[v];
        rank = new int[v];
        Arrays.fill(parent,-1);
        Arrays.sort(graph,(a,b)->(a[2]-b[2]));//Sort the graph based on weight
        int count = 0,ind = 0;
        while(count<v && ind<graph.length){
            int from=find(graph[ind][0]);
            int to = find(graph[ind][1]);
            if(from==to){//Cycle formed so discard this edge
                ind++;
                continue;
            }
            union(from,to);
            List<Integer> l = new ArrayList<>();
            l.add(graph[ind][0]);
            l.add(graph[ind][1]);
            l.add(graph[ind][2]);
            list.add(l);
            count++;
            ind++;
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
	public static void main(String[] args) {
		v = 6;
		int[][] graph = {{0,1,1},{1,3,1},{2,4,1},{0,2,2},{2,3,2},{3,4,2},{1,2,3},{1,4,3},{4,5,3},{3,5,4}};
		findMST(graph);
	}
}
