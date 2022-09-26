import java.util.*;
public class Main
{   
    public static int MinimumHours(int[] garden,int worker){
        int sum=0,max=0;
        for(int i=0;i<garden.length;i++){
            if(max<garden[i]){
                max=garden[i];
            }
            sum=sum+garden[i];
        }
        int low=max;
        int high = sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(Possible(garden,mid,worker)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean Possible(int[] garden,int mid,int worker){
        int len = garden.length;
        int w=1,sum=0;
        for(int i=0;i<len;i++){
            if(sum+garden[i]<=mid){
                sum=sum+garden[i];
            }
            else{
                sum=garden[i];
                w++;
            }
        }
        if(w<=worker){
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] garden = new int[n];
		for(int i=0;i<n;i++){
		    garden[i]=scanner.nextInt();
		}
		int worker = scanner.nextInt();
		System.out.println(MinimumHours(garden,worker));
	}
}
