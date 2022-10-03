class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
               int val=nums3[i]+nums4[j];
               if(map.containsKey(val)==false){
                   map.put(val,1);
               }
                else{
                    int c=map.get(val);
                    map.put(val,c+1);
                }
            }
        }
        int count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int val=(nums1[i]+nums2[j]);
                if(val!=0){
                    val=(-1)*val;
                }
                if(map.containsKey(val)==true){
                    count+=map.get(val);
                }
            }
        }
        return count;
    }
}
