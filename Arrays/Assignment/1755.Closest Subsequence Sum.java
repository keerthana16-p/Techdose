class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        int mid = (nums.length-1)/2;
        List<Integer> s1 = PossibleSum(nums,0,mid);
        List<Integer> s2 = PossibleSum(nums,mid+1,nums.length-1);
        Collections.sort(s2);
        return MinDifference(s1,s2,goal);
    }
    public static List<Integer> PossibleSum(int[] nums,int start,int end){
        int len = (end-start)+1,index=0;
        int[] arr = new int[len];
        for(int i=start;i<=end;i++){
            arr[index++]=nums[i];
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<(1<<len);i++){
            int sum=0;
           for(int j=0;j<len;j++){
               if((i&(1<<j))>0){
                   sum=sum+arr[j];
               }
           }
            res.add(sum);
        }
        return res;
    }
    public static int MinDifference(List<Integer> s1,List<Integer> s2,int target){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<s1.size();i++){
            int val=s1.get(i),low=0,high=s2.size()-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                int sum=val+s2.get(mid);
                if(sum==target){
                    return 0;
                }
                else if(sum>target){
                    min=Math.min(min,sum);
                    high=mid-1;
                }
                else{
                    max=Math.max(max,sum);
                    low=mid+1;
                }
            }
        }
        return Math.min(Math.abs(min-target),Math.abs(max-target));
    }
}
