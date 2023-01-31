import java.util.Arrays;
public class Main{
    public static int median(int[][] mat,int row,int col){
        //Find min and max;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            if(mat[i][0]<min){
                min=mat[i][0];
            }
            if(mat[i][col-1]>max){
                max=mat[i][col-1];
            }
        }
        int res = (row*col+1)/2;//Number of values less than the median
        //Binary Search
        while(min<max){
            int mid = min+(max-min)/2;
            int place=0,get=0;//place -> to find the count of no.s less than the mid
            for(int i=0;i<row;i++){
                get=Arrays.binarySearch(mat[i],mid);
                //Not found -> -(insertion position)col-1
                //found -> Index 
                if(get<0){
                    get=Math.abs(get)-1;
                }
                else{
                    while(get<mat[i].length && mat[i][get]==mid){
                        get+=1;
                    }
                }
                place+=get;
            }
            if(place<res){
                min=mid+1;
            }
            else{
                max=mid;
            }
        }
        return min;
    }
    public static void main(String[] args){
        int row = 3;
        int col = 3;
        int[][] mat = {{ 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
        System.out.println(median(mat,row,col));
    }
}
