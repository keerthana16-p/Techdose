class Solution {
    public long smallestNumber(long num) {
        if(num==0){
            return 0;
        }
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        String str;
        if(num>0){
           if(arr[0]=='0'){
              int index=1;
               for(int i=1;i<arr.length;i++){
                   if(arr[i]!='0'){
                       index=i;
                       break;
                   }
               }
               char temp=arr[0];
               arr[0]=arr[index];
               arr[index]=temp;
           }
           str=new String(arr);
        }
        else{
            str=new String(arr);
            StringBuilder s = new StringBuilder(str.substring(1));
            str='-'+(s.reverse().toString());
        }
        return Long.valueOf(str);
    }
}
