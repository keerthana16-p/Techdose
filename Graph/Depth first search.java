import java.util.*;
public class Main
{   
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    public static void recursive_dfs(int n){
        System.out.print(n+" ");
        visited[n]=true;
        for(int val:list.get(n)){
            if(!visited[val]){
                recursive_dfs(val);
            }
        }
    }
    public static void iterative_dfs(int n,int size){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[size];
        stack.push(n);
        while(!stack.isEmpty()){
            int val = stack.pop();
            if(!visited[val]){
                System.out.print(val+" ");
                visited[val]=true;
                for(int i:list.get(val)){
                    if(!visited[i]){
                        stack.push(i);
                    }
                }
            }
            
        }
    }
	public static void main(String[] args) {
		int n = 6;
		int[][] edges = {{1,2},{2,3},{3,4},{4,5}};
		visited = new boolean[n];
		for(int i=0;i<n;i++){
		    list.add(new ArrayList<Integer>());
		}
		for(int i=0;i<edges.length;i++){
		    list.get(edges[i][0]).add(edges[i][1]);
		    list.get(edges[i][1]).add(edges[i][0]);
		}
		recursive_dfs(1);
		System.out.println();
		iterative_dfs(1,n);
	}
}
