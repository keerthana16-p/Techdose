import java.util.Scanner;
public class Main
{   
    public static char toUpper(char ch){
        //'a'->'A'=>unset the 6th bit(32)
        return (char)(ch&(~ (1<<5) ));
    } 
    public static char toLower(char ch){
        //'A'->'a'=>set the 6th bit(32)
        return (char)(ch|(1<<5));
    } 
    public static char toggle(char ch){
      //toggle the 6th bit
        return (char)(ch^(1<<5));
    } 
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 char ch = scanner.next().charAt(0);
	 System.out.println("Upper Case is "+toUpper(ch));
	 System.out.println("Lower Case is "+toLower(ch));
	 System.out.println("Inverted Case is "+toggle(ch));
	}
}
