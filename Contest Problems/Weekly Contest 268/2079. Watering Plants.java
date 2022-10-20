class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count = 0,c=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=capacity){
                count=count+1;
                capacity=capacity-plants[i];
            }
            else{
                count=count+i+i+1;
                capacity=c;
                capacity=capacity-plants[i];
            }
        }
        return count;
    }
}
