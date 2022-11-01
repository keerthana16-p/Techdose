class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        PriorityQueue<int[]> free = new PriorityQueue<>((a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        PriorityQueue<int[]> used = new PriorityQueue<>((a,b)->a[2]!=b[2]?a[2]-b[2]:a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        for(int i=0;i<servers.length;i++){
            free.add(new int[]{servers[i],i,0});
        }
        int[] res = new int[tasks.length];
        for(int i=0;i<tasks.length;i++){
            int t=tasks[i];
            while(!used.isEmpty() && used.peek()[2]<=i){
                free.add(used.poll());
            }
            if(!free.isEmpty()){
                int[] temp=free.poll();
                res[i]=temp[1];
                temp[2]=i+t;
                used.add(temp);
            }
            else{
                int[] temp = used.poll();
                res[i]=temp[1];
                temp[2]+=t;
                used.add(temp);
            }
        }
        return res;
    }
}
