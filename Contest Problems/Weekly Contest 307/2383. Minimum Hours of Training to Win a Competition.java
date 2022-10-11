class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int curen=initialEnergy;
        int curex=initialExperience,len=energy.length,traine=0,trainex=0;
        for(int i=0;i<len;i++){
            if(curen>energy[i] ){
                curen-=energy[i];
            }
            else if(curen==energy[i]){
                traine+=1;
                curen-=energy[i];
            }
            else if(curen<energy[i] && curen>0){
                traine+=(energy[i]-curen);
                curen-=energy[i];
            }
            else if(curen<energy[i] && curen==0){
                traine+=energy[i];
            }
            if(curex>experience[i]){
                 curex+=experience[i];
            }
            else if(curex==experience[i]){
                trainex+=1;
                curex+=experience[i]+1;
            }
            else if(curex<experience[i]){
                int val=(experience[i]-curex)+1;
                trainex+=val;
                curex+=val;
            }
        }
        System.out.println(traine+" "+trainex);
        return (traine+trainex);
    }
}
