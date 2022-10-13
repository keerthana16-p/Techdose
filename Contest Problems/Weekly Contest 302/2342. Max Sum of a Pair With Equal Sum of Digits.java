class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,ArrayList<Integer>>map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int s=0,temp=nums[i];
            while(temp>0){
               s=s+(temp%10);
               temp=temp/10;
            }
            if(map.containsKey(s)==true){
               ArrayList<Integer> list = map.get(s);
               list.add(nums[i]);
               map.put(s,list);
            }
            else{
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(nums[i]);
                map.put(s,list);
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> list : map.entrySet()){
            ArrayList<Integer> temp = list.getValue();
            Collections.sort(temp);
            if(temp.size()>1){
                max=Math.max(max,(temp.get(temp.size()-1)+temp.get(temp.size()-2)));
            }
        }
        System.out.println(map);
        if(max==Integer.MIN_VALUE){
            return -1;
        }
        return max;
    }
}
