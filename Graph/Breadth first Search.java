import java.util.*;
public class Main
{   
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    public static void recursive_bfs(Queue<Integer> queue){
        if(queue.isEmpty()){
            return ;
        }
       int val = queue.poll();
       if(!visited[val]){
           System.out.print(val+" ");
           visited[val]=true;
           for(int i:list.get(val)){
               if(!visited[i]){
                   queue.add(i);
               }
           }
       }
       recursive_bfs(queue);
    }
    public static void iterative_bfs(int n,int size){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[size];
        queue.add(n);
        while(!queue.isEmpty()){
            int val = queue.poll();
            if(!visited[val]){
                System.out.print(val+" ");
                visited[val]=true;
                for(int i:list.get(val)){
                    if(!visited[i]){
                        queue.add(i);
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
		iterative_bfs(1,n);
		System.out.println();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		recursive_bfs(queue);
	}
}
