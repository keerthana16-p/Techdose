class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combination(candidates,target,0,new ArrayList<Integer>());
        return res;
    }
    public  void combination(int[] candidates,int target,int index,List<Integer> list){
        if(index==candidates.length || target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList(list));
            return;
        }
        combination(candidates,target,index+1,list);
        list.add(candidates[index]);
        combination(candidates,target-candidates[index],index,list);
        list.remove(list.size()-1);
    }
}
