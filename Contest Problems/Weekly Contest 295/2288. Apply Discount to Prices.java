class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] str = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for(String s:str){
            if(s.charAt(0)!='$'){
                res.append(s);
                res.append(" ");
            }
           else{
               if(s.length()==1 && s.charAt(0)=='$'){
                   res.append("$");
                   res.append(" ");
                   continue;
               }
               int i=1,c=1;
               while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
                   c++;
                   i++;
               }
               if(c==s.length()){
                   double value=Double.parseDouble(s.substring(1));
                   double ans = value-(value*(discount/100.0));
                   res.append("$");
                   res.append(String.format("%.2f",ans));
                   res.append(" ");
               }
               else{
                   res.append(s);
                   res.append(" ");
               }
           }
        }
        return res.toString().trim();
    }
}
