import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        for(int i=0;i<n1;i++){
            nums1[i]=scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        for(int i=0;i<n2;i++){
            nums2[i]=scanner.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Stack<Integer> stack = new Stack<>();
        for(int i=n2-1;i>=0;i--){
            int val=nums2[i];
            if(stack.size()>0 && stack.peek()<val){
                map.put(stack.pop(),val);
            }
            stack.push(val);
        }
        int[] res = new int[n1];
        int i=0;
        for(int val:nums1){
            if(map.containsKey(val)==true){
                res[i++]=map.get(val);
            }
            else{
                res[i++]=-1;
            }
        }
        for(int val:res){
            System.out.print(val+" ");
        }
    }
}
