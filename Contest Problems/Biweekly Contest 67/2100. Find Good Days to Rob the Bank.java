class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int[] left = new int[security.length];
        int[] right = new int[security.length];
        for(int i=1;i<security.length-time;i++){
            if(security[i]>security[i-1]){
                left[i]=0;
            }
            else{
                left[i]=left[i-1]+1;
            }
        }
        for(int i=security.length-2;i>=time;i--){
            if(security[i]>security[i+1]){
                right[i]=0;
            }
            else{
                right[i]=right[i+1]+1;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=time;i<security.length-time;i++){
            if(left[i]>=time && right[i]>=time){
                list.add(i);
            }
        }
        return list;
    }
}
