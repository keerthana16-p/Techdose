import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int a= scanner.nextInt();
	 int b= scanner.nextInt();
	 System.out.println("After Swapping "+a+" "+b);
	 a=a^b;
     b=b^a;//b^a=>b^a^b=a
     a=a^b;//a^b=>a^b^a=b
	 System.out.println("After Swapping "+a+" "+b);
	}
}
