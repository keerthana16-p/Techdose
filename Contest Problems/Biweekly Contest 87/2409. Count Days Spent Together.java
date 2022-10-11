class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int arriveAlicemon = Integer.parseInt(arriveAlice.substring(0,2));
        int arriveAlicedate = Integer.parseInt(arriveAlice.substring(3));
        int leaveAlicemon = Integer.parseInt(leaveAlice.substring(0,2));
        int leaveAlicedate = Integer.parseInt(leaveAlice.substring(3));
        int arriveBobmon = Integer.parseInt(arriveBob.substring(0,2));
        int arriveBobdate = Integer.parseInt(arriveBob.substring(3));
        int leaveBobmon = Integer.parseInt(leaveBob.substring(0,2));
        int leaveBobdate = Integer.parseInt(leaveBob.substring(3));
        int[] days = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] cumulative = new int[13];
        cumulative[0]=0;
        for(int i=1;i<=12;i++){
            for(int j=0;j<i;j++){
                cumulative[i]+=days[j];
            }
        }
        int arrivea=cumulative[arriveAlicemon]+arriveAlicedate;
        int arriveb=cumulative[arriveBobmon]+arriveBobdate;
        int leavea=cumulative[leaveAlicemon]+leaveAlicedate;
        int leaveb=cumulative[leaveBobmon]+leaveBobdate;
        int max=Math.max(arrivea,arriveb);
        int min=Math.min(leavea,leaveb);
        if(min<max){
            return 0;
        }
        return min-max+1;
    }
}
