public class Main{
    public static void Update(int[] arr,int start,int end,int val){
        arr[start]+=val;
        if(end+1<arr.length){
            arr[end+1]=-1*val;
        }
    }
    public static void Print(int[] arr){
        //Find prefix sum
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int n=6;
        int[] arr = new int[n];
        Update(arr,0,2,100);
        Update(arr,1,5,100);
        Update(arr,2,3,100);
        Print(arr);
    }
}
