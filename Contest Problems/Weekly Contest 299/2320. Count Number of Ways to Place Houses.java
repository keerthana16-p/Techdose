/*This is similar to fibonacci series
 1->4(2*2)
 2->9(3*3)
 3->25(5*5)
 4->64(8*8)
 
 => 1->2
 => 2->3
 => 3->5(2+3)
 => 4->8(5+3)
 */
class Solution {
    public int countHousePlacements(int n) {
         int res=0;
        if(n==1){
            return 4;
        }
        else if(n==2){
            return 9;
        }
        else{
            long val=1000000007;
            long f1=2;
            long f2=3;
            long f3=0;
          for(int i=3;i<=n;i++){
             f3=f2+f1;
             f1=f2%val;
             f2=f3%val;
        }
        res=(int)(f3*f3%val);
        }
        return res;
    }
}
