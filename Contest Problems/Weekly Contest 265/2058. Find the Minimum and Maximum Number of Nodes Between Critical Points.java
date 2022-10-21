class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        int[] arr = new int[c];
        int i=0;
        temp=head;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
        }
        int[] res= new int[2];
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,critical=-1;
        List<Integer> cri = new ArrayList<>();
        for(i=1;i<c-1;i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
              cri.add(i+1);
            }
            else if(arr[i-1]>arr[i] && arr[i+1]>arr[i]){
               cri.add(i+1);
            }
        }
        System.out.println(cri);
        Collections.sort(cri);
        if(cri.size()>1){
            for(i=1;i<cri.size();i++){
               min=Math.min(cri.get(i)-cri.get(i-1),min);
            }
            int mi=cri.get(0);
            int ma=cri.get(0);
            for(i=1;i<cri.size();i++){
                mi=Math.min(mi,cri.get(i));
                ma=Math.max(ma,cri.get(i));
            }
            max=ma-mi;
        }
        else{
            min=-1;
            max=-1;
        }
       res[0]=min;
       res[1]=max;
        return res;
    }
}
