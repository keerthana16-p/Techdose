class Solution {
    class Cars{
        int position,speed;
        public Cars(int position,int speed){
            this.position=position;
            this.speed = speed;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        Cars[] cars = new Cars[position.length];
        for(int i=0;i<position.length;i++){
            cars[i]=new Cars(position[i],speed[i]);
        }
        Arrays.sort(cars,(a,b)->a.position-b.position);
        Stack<Double> stack = new Stack<>();
        for(int i=position.length-1;i>=0;i--){
            double time =(double)(target-cars[i].position)/cars[i].speed;
            if(stack.size()==0 || stack.peek()<time){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
