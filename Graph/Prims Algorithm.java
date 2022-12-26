import java.util.*;
public class Main
{   
    static int v;
    public static int selectMin(int[] distance,boolean[] setMST){
        int min = Integer.MAX_VALUE;
        int vertex = -1;
        for(int i=0;i<v;i++){
            if(setMST[i]==false && distance[i]<min){
                vertex=i;
                min=distance[i];
            }
        }
        return vertex;
    }
    public static void findMST(int[][] graph){
        int[] distance = new int[v];
        int[] parent = new int[v];
        boolean[] setMST = new boolean[v];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[0]=0;
        parent[0]=-1;
        //v-1 -> number of edges in the resultant spanning tree
        for(int i=0;i<v-1;i++){
            int cur = selectMin(distance,setMST);//Finding minimum node
            setMST[cur]=true; // indicates node cur has processed 
            for(int j=0;j<v;j++){ // to change the weights of the adjacent nodes of cur
                if(graph[cur][j]!=0 && setMST[j]==false && graph[cur][j]<=distance[j]){
                    distance[j]=graph[cur][j];
                    parent[j]=cur;
                }
            }
        }
        for(int i=1;i<v;i++){
            System.out.print(i+" "+parent[i]+"->"+distance[i]);
            System.out.println();
        }
    }
	public static void main(String[] args) {
	    v = 6;
		int[][] graph = {{0,4,6,0,0,0},{4,0,6,3,4,0},{6,6,0,1,0,0},{0,3,1,0,2,3},{0,4,0,2,0,7},{0,0,0,3,7,0}};
		findMST(graph);
	}
}
