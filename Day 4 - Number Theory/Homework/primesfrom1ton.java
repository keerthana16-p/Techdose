import java.util.Scanner;
public class Main
{   
    public static void isPrime(int n){
      boolean[] array = new boolean[n+1];
      for(int i=2;i<=n;i++){
          if(array[i]==false){
              for(int j=2*i;j<=n;j=j+i){
                  array[j]=true;
              }
          }
      }
       for(int i=2;i<=n;i++){
           if(array[i]==false){
               System.out.print(i+" ");
           }
       }
    }
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n= scanner.nextInt();
	 isPrime(n);
	}
}
