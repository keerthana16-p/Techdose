class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n!=0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }
        else if(m!=0 && n!=0){
            int j=n-1,i=m-1,k=m+n-1;
            while(j>=0 && i>=0){
            if(nums2[j]>nums1[i]){
                nums1[k]=nums2[j];
                k--;
                j--;
            }
            else{
                nums1[k]=nums1[i];
                k--;
                i--;
            }             
        }
            while(i>=0){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            while(j>=0){
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
    }
}
