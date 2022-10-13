class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<passengers.length;i++){
            list.add(passengers[i]);
        }
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int i=0,c,res=0;
        for(int j=0;j<buses.length;j++){
            c=capacity;
            while(i<passengers.length  && c>0 && passengers[i]<=buses[j]){
                res=passengers[i];
                i++;
                c--;
            }
            if(c!=0){
                res=buses[j];
            }
        }
        while(list.contains(res)==true){
            res--;
        }
        return res;
    }
}
