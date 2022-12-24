//Topological Sort using DFS with tc=O(E+V)
import java.util.*;
public class Main
{   
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static Stack<Integer> stack = new Stack<>();
    public static void topoSort(int val){
        visited[val]=true;
        for(int i:list.get(val)){
            if(!visited[i]){
                topoSort(i);
            }
        }
        stack.push(val);
    }
	public static void main(String[] args) {
		int n =6;
		int[][] edges = {{0,2},{0,3},{5,0},{5,2},{4,2},{4,1},{3,1}};
		visited = new boolean[n];
		for(int i=0;i<n;i++){
		    list.add(new ArrayList<>());
		}
		for(int i=0;i<edges.length;i++){
		    list.get(edges[i][0]).add(edges[i][1]);
		}
		//For the nodes with no connection with the start and its adjacent nodes
		for(int i=0;i<n;i++){
		    if(!visited[i]){
		        topoSort(i);
		    }
		}
		while(!stack.isEmpty()){
		    System.out.println(stack.pop());
		}
	}
}
