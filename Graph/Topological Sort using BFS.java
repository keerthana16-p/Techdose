//Topological Sort using BFS
import java.util.*;
public class Main
{   
    static int[] indegree;
    static List<List<Integer>> list = new ArrayList<>();
    static Queue<Integer> queue;
    public static void TopoSort(){
        while(!queue.isEmpty()){
            int val = queue.poll();
            System.out.println(val);
            for(int i:list.get(val)){
                indegree[i]-=1;
                if(indegree[i]==0){
                    queue.add(i);
                }
            }
        }
        
    }
	public static void main(String[] args) {
		int n = 6;
		int[][] edges = {{0,2},{0,3},{5,0},{5,2},{4,2},{4,1},{3,1}};
		for(int i=0;i<n;i++){
		    list.add(new ArrayList<Integer>());
		}
		for(int i=0;i<edges.length;i++){
		    list.get(edges[i][0]).add(edges[i][1]);
		}
		indegree = new int[n];
		queue=new LinkedList<>();
		//To calculate the indegree 
		for(int i=0;i<n;i++){
		    for(int j:list.get(i)){
		        indegree[j]++;
		    }
		}
		for(int i=0;i<n;i++){
		    if(indegree[i]==0){
		        queue.add(i);
		    }
		}
		TopoSort();
	}
}
