import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String ans = "";
        Permutation(str,ans);
    }
    public static void Permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans+" ");
            return ;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            Permutation(left+right,ans+ch);
        }
    }
}
