class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                result[0]=i;
                result[1]=j;
                }
            }
        }
        return result;
    }
}

//Two pointer technique(but here if we sort then index will be changed)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        while(i<=j){
            if((nums[i]+nums[j])==target){
                res[0]=i;
                res[1]=j;
                break;
            }
            else if((nums[i]+nums[j])>target){
                j--;
            }
            else if((nums[i]+nums[j])<target){
                i++;
            }
        }
        return res;
    }
}
