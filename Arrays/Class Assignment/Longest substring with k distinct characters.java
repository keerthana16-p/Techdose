import java.util.*;
public class Main
{   
    public static int UniqueCharacters(String str,int k){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int left=0,right=0,max=Integer.MIN_VALUE;
        while(right<str.length()){
            if(map.containsKey(str.charAt(right))==true){
                map.put(str.charAt(right),map.get(str.charAt(right))+1);
            }
            else{
                map.put(str.charAt(right),1);
            }
            if(map.size()>k){
                map.put(str.charAt(left),map.get(str.charAt(left))-1);
                if(map.get(str.charAt(left))==0){
                    map.remove(str.charAt(left));
                }
                left++;
            }
            if(map.size()==k){
                max=max<(right-left+1)?(right-left+1):max;
            }
            right++;
        }
        return max;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int k = scanner.nextInt();
		System.out.println("Longest substring length that has k unique characters is "+UniqueCharacters(str,k));
	}
}
