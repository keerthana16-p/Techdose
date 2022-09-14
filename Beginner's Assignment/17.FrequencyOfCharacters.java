import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		Map<Character,Integer> frequency = new LinkedHashMap<Character,Integer>();
		int len = str.length();
		for(int i=0;i<len;i++){
		    if(frequency.containsKey(str.charAt(i))==true){
		        int count=frequency.get(str.charAt(i));
		        frequency.put(str.charAt(i),count+1);
		    }
		    else{
		        frequency.put(str.charAt(i),1);
		    }
		}
		for(Map.Entry<Character,Integer> entry: frequency.entrySet()){
		    System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}

NOTE
* If we use HashMap it maintains random order
* If we use LinkedHashMap it maintains input order
* If we use TreeMap it maintains sorted order(ascending)
