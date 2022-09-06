import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n= scanner.nextInt();
	 int r= scanner.nextInt();
	 int[][] mat = new int[n+1][n+1];
	 for(int i=0;i<=n;i++){
	     for(int j=0;j<=i;j++){
	        if(i==j || j==0){
	           mat[i][j]=1;
	             }
	        else{
	           mat[i][j]=mat[i-1][j]+mat[i-1][j-1];
	             }
	     }
	 }
	 System.out.println(mat[n][r]);
	}
}
