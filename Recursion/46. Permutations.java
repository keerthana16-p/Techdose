class Solution {
     List<List<Integer>> list = new ArrayList<>();
     List<Integer> cur = new ArrayList<>();
    public  List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            temp.add(nums[i]);
        }
        Permutation(temp,cur);
        return list;
    }
    public  void Permutation(List<Integer> nums,List<Integer> cur){
        if(nums.size()==0){
            list.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.size();i++){
            List<Integer> rest = new ArrayList<>();
            int n=nums.get(i);
            rest.addAll(nums);
            rest.remove(i);
            cur.add(n);
            Permutation(rest,cur);
            cur.remove(cur.size()-1);
        }
    }
}
