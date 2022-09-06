import java.util.Scanner;
public class Main
{   
    public static int rightMostOne(int n){
        int pos=0;
        while((n&1)==0){
            n=n>>1;
            pos++;
        }
        return pos+1;
    }
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 System.out.println("Right most one in the binary representation is "+rightMostOne(n));
	}
}
