import java.util.*;
public class Main
{   
    public static void adjacencyList(int[][] edges,int n){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println("Adjacency List");
        for(int i=0;i<n;i++){
            System.out.println(i+" "+list.get(i));
        }
    }
    public static void adjacencyMatrix(int[][] edges,int n){
        int[][] matrix = new int[n][n];
        for(int i=0;i<edges.length;i++){
            matrix[edges[i][0]][edges[i][1]]=1;
            matrix[edges[i][1]][edges[i][0]]=1;
        }
        System.out.println("Adjacency Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
	   int n = 6;
	   int[][] edges = {{1,2},{2,3},{3,4},{4,5}};
	   adjacencyList(edges,n);
	   adjacencyMatrix(edges,n);
	}
}
