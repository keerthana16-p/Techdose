//Segment Tree 
public class Main
{   
    static int[] seg_tree;
    Main(int n){
        seg_tree=new int[4*n+1];
    }
    public static void BuildSegmentTree(int st_ind,int start,int end,int[] arr){
        if(start>end){
            return ; 
        }
        if(start==end){//base condition-->leaf node
            seg_tree[st_ind]=arr[start];
            return;
        }
        //Internal nodes
        int mid = start+(end-start)/2;
        BuildSegmentTree(2*st_ind,start,mid,arr);
        BuildSegmentTree(2*st_ind+1,mid+1,end,arr);
        seg_tree[st_ind]=Math.max(seg_tree[2*st_ind],seg_tree[2*st_ind+1]);
    }
    public static int RangeMaximum(int st_ind,int qs,int qe,int start,int end){
        //No Overlapping
        if(qe<start || end<qs){
            return 0;
        }
        //Total overlapping 
        if(qs<=start && end<=qe){
            return seg_tree[st_ind];
        }
        //Partial overlapping-->Explore left and right children
        int mid = start+(end-start)/2;
        int leftsum = RangeMaximum(2*st_ind,qs,qe,start,mid);
        int rightsum = RangeMaximum(2*st_ind+1,qs,qe,mid+1,end);
        return Math.max(leftsum,rightsum);
    }
    public static void Update(int st_ind,int start,int end,int pos,int val){
        //No overlapping
        if(pos<start || pos>end){
            return ;
        }
        //Total overlapping
        if(start==end){
            seg_tree[st_ind]=val;
            return;
        }
        //Partial overlapping
        int mid = start+(end-start)/2;
        Update(2*st_ind,start,mid,pos,val);
        Update(2*st_ind+1,mid+1,end,pos,val);
        seg_tree[st_ind]=Math.max(seg_tree[2*st_ind],seg_tree[2*st_ind+1]);
    }
	public static void main(String[] args) {
	   int n = 6;
	   Main main = new Main(n);
	   int[] arr = {1,2,3,4,5,6};
	   int st_ind = 1,start=0,end=n-1;
	   BuildSegmentTree(st_ind,start,end,arr);
	   int res = RangeMaximum(st_ind,0,5,start,end);
	   System.out.println("\nRange Maximum is "+res);
	   Update(st_ind,start,end,4,10);
	}
}
