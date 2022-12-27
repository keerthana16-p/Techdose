import java.util.*;
public class Main
{   
    static int v;
    public static int findMin(int[] value,boolean[] visited){
        int vertex=-1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<v;i++){
            if(visited[i]==false && value[i]<min){
                min=value[i];
                vertex = i;
            }
        }
        return vertex;
    }
    public static void findSPG(int[][] graph){
        int[] value = new int[v];
        int[] parent = new int[v];
        boolean[] visited = new boolean[v];
        Arrays.fill(value,Integer.MAX_VALUE);
        value[0]=0;
        parent[0]=-1;
        for(int i=0;i<v-1;i++){
            int vertex = findMin(value,visited);
            visited[vertex]=true;
            for(int j=0;j<v;j++){
                if(graph[vertex][j]!=0 && visited[j]==false && (value[vertex]+graph[vertex][j])<value[j]){
                    value[j]=value[vertex]+graph[vertex][j];
                    parent[j]=vertex;
                }
            }
        }
        for(int i=1;i<v;i++){
            System.out.print(i+" "+parent[i]+"->"+graph[i][parent[i]]+"\n");
        }
    }
	public static void main(String[] args) {
		v=6;
		int[][] graph = {{0,1,4,0,0,0},{1,0,4,2,7,0},{4,4,0,3,5,0},{0,2,3,0,4,6},{0,7,5,4,0,7},{0,0,0,6,7,0}};
		findSPG(graph);//SPF -> Shortest Path Graph
	}
}
