import java.util.Scanner;
public class Main
{   
    public static int leastPower(int n){
      /*  while(n && (n&(n-1))){
            n=n&(n-1);
        }
        return n;*/
        int ctr=0;
        while(n>0){
            n=n>>1;
            ctr++;
        }
        return 1<<(ctr-1);
    } 
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 System.out.println("Least Power of 2 is "+leastPower(n));
	}
}
