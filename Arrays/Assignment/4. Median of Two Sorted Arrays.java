class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int len = l1 +l2;
        int i=0,j=0,k=0;
        int[] arr = new int[len];
        while(i<l1 && j<l2){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<l1){
           arr[k++]=nums1[i++];
        }
        while(j<l2){
            arr[k++]=nums2[j++];
        }
        double res=0.0;
        if(len%2!=0){
            res=arr[len/2];
        }
        else{
            res=(arr[len/2]+arr[(len/2)-1])/2.0;
        }
        return res;
    }
}
