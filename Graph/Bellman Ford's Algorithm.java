import java.util.*;
public class Main
{   
    public static void findSPG(int[][] edges,int vertix){
        int[] parent = new int[vertix];
        int[] cost = new int[vertix];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[0]=0;
        parent[0]=-1;
        boolean updated = false;
        //v-1 times iteration
        for(int i=1;i<vertix;i++){
            updated=false;
            for(int j=0;j<edges.length;j++){
                int s = edges[j][0];
                int d = edges[j][1];
                int c = edges[j][2];
                if((cost[s]+c)<cost[d]){
                    updated=true;
                    cost[d]=cost[s]+c;
                    parent[d]=s;
                }
            }
            if(updated==false){
                break;
            }
        }
        //Additional Iteration->To check the negative edge weight cycle
        if(updated==true){
            for(int i=0;i<edges.length;i++){
                int s = edges[i][0];
                int d = edges[i][1];
                int c = edges[i][2];
                if((cost[s]+c)<cost[d]){
                   System.out.println("The graph has no negative edge weight cycle");
                   return ;
                }
            }
        }
        //To print the shortest path graph
        for(int i=0;i<vertix;i++){
            System.out.print(i+"->"+cost[i]+"\n");
        }
    }
	public static void main(String[] args) {
		int v = 5;
		int[][] edges = {{0,1,6},{0,2,7},{1,2,8},{1,3,-4},{1,4,5},{2,3,9},{2,4,-3},{3,4,7},{3,0,2},{4,1,-2}};
		findSPG(edges,v);
	}
}
