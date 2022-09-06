import java.util.Scanner;
public class Main
{   
    public static void factors1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void factors2(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if((n/i)!=i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n= scanner.nextInt();
	 factors1(n);
	 factors2(n);
	}
}
