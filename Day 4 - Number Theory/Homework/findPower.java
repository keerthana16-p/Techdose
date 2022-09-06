import java.util.Scanner;
public class Main
{   
    public static int findPower(int base,int power){
        int res=1;
        while(power>0){
            if(power%2==1){
                res*=base;
            }
            base=base*base;
            power=power/2;
        }
        return res;
    }
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int base= scanner.nextInt();
	 int power= scanner.nextInt();
	 System.out.println(findPower(base,power));
	}
}
