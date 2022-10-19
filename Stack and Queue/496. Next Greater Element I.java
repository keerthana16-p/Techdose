class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> stack = new Stack<Integer>();
       int[] res = new int[nums1.length];
       Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
        for(int val:nums2){
           while(!stack.empty() && stack.peek()<val){
              map.put(stack.pop(),val);
           } 
            stack.push(val);
        }
            int i=0;
        for(int val:nums1){
            if(map.containsKey(val)==true){
                res[i++]=map.get(val);
            }
            else{
                res[i++]=-1;
            }
        }
            return res;
    }
}
