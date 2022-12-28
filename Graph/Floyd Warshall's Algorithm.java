import java.util.*;
public class Main
{   
    public static void APSP(int v,int[][] matrix){
        int[][] distance = new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                distance[i][j]=matrix[i][j];
            }
        }
        for(int k=0;k<v;k++){
            for(int i=0;i<v;i++){
                for(int j=0;j<v;j++){
                    if(i==k || j==k || distance[i][k]==Integer.MAX_VALUE || distance[k][j]==Integer.MAX_VALUE){
                        continue;
                    }
                    if(distance[i][k]+distance[k][j]<distance[i][j]){
                        distance[i][j]=distance[i][k]+distance[k][j];
                    }
                }
            }
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(distance[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
	   int vertex = 4;
	   int[][] matrix = {{0,3,Integer.MAX_VALUE,5},{2,0,Integer.MAX_VALUE,8},{Integer.MAX_VALUE,1,0,Integer.MAX_VALUE},{Integer.MAX_VALUE,Integer.MAX_VALUE,2,0}};
	   APSP(vertex,matrix);//ASPF -> all pair shortest path
	}
}
