import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
/*INPUT
  5
  1
  12
  123
  1234
  12345
  */
