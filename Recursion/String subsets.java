import java.util.*;
public class Main{
    static List<String> list = new ArrayList<>();
    static String curr="";
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       String str = scanner.next();
       subsets(str,0,curr);
       System.out.println(list);
    }
    public static void subsets(String str,int pos,String curr){
        if(pos==str.length()){
            list.add(curr);
            return ;
        }
        subsets(str,pos+1,curr);
        curr=curr+str.charAt(pos);
        subsets(str,pos+1,curr);
    }
}
