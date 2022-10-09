import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
		    arr[i]=scanner.nextInt();
		    if(map.containsKey(arr[i])==true){
		        map.put(arr[i],map.get(arr[i])+1);
		    }
		    else{
		        map.put(arr[i],1);
		    }
		}
		int k = scanner.nextInt();
		for(int i=0;i<n;i++){
		    if(map.get(arr[i])==(n/k)){
		        System.out.print(arr[i]+" ");
		    }
		}
	}
}
