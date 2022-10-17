class Solution {
    public String minimizeResult(String expression) {
        String str[] = expression.split("\\+");
        String left = str[0];
        String right = str[1];
        int min = Integer.MAX_VALUE;
        String res = "";
        for(int i=0;i<left.length();i++){
            int leftMul = left.substring(0,i).equals("")?1:Integer.parseInt(left.substring(0,i));
            int leftSum = Integer.parseInt(left.substring(i));
            for(int j=1;j<=right.length();j++){
                int rightSum = Integer.parseInt(right.substring(0,j));
                int rightMul = right.substring(j).equals("")?1:Integer.parseInt(right.substring(j));
                int val = leftMul*(leftSum + rightSum)*rightMul;
                if(val<min){
                    min = val;
                    res=left.substring(0,i)+"("+left.substring(i)+"+"+right.substring(0,j)+")"+right.substring(j);
                }
            }
        }
        return res;
    }
}
