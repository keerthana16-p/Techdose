class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(items1,(a,b)->(a[0]-b[0]));
        Arrays.sort(items2,(a,b)->(a[0]-b[0]));
        int i=0,j=0;
        while(i<items1.length && j<items2.length){
            if(items1[i][0]==items2[j][0]){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(items1[i][0]);
                temp.add(items1[i][1]+items2[j][1]);
                list.add(temp);
                i++;
                j++;
            }
            else if(items1[i][0]<items2[j][0]){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(items1[i][0]);
                temp.add(items1[i][1]);
                list.add(temp);
                i++;
            }
            else{
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(items2[j][0]);
                temp.add(items2[j][1]);
                list.add(temp);
                j++;
            }
        }
        while(i<items1.length){
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(items1[i][0]);
            temp.add(items1[i][1]);
            list.add(temp);
            i++;
        }
        while(j<items2.length){
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(items2[j][0]);
            temp.add(items2[j][1]);
            list.add(temp);
            j++;
        }
        return list;
    }
}
