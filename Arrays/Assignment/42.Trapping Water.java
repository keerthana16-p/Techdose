class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int leftmax=height[0];
        int rightmax=height[len-1];
        int[] left = new int[len];
        int[] right = new int[len];
        left[0]=0;
        right[len-1]=0;
    //to find maximum value present to the current value in left
        for(int i=1;i<len;i++){
            left[i]=leftmax;
            if(height[i]>leftmax){
                leftmax=height[i];
            }
        }
    //to find maximum value present to the current value in right
        for(int i=len-2;i>=0;i--){
            right[i]=rightmax;
            if(height[i]>rightmax){
                rightmax=height[i];
            }
        }
        int trappedwater=0;
        for(int i=1;i<len-1;i++){
            int waterlevel=Math.min(left[i],right[i]);
            if(waterlevel-height[i]>0){
            trappedwater=trappedwater+(waterlevel-height[i]);
            }
        }
        return trappedwater;
    }
}
