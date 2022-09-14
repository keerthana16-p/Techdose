import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int[][] matrix = new int[row][col];
		int[][] transpose = new int[col][row];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        matrix[i][j]=scanner.nextInt();
		    }
		}
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        transpose[j][i]=matrix[i][j];
		    }
		}
		for(int i=0;i<col;i++){
		    for(int j=0;j<row;j++){
		        System.out.print(transpose[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
