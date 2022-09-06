import java.util.Scanner;
public class Main
{   
   public static int countSetBit(int n){
       int count=0;
       while(n!=0){
           if((n&1)==1){
               count+=1;
           }
           n=n>>1;
       }
       return count;
   } 
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 System.out.println("Count of set bits are "+countSetBit(n));
	}
}
