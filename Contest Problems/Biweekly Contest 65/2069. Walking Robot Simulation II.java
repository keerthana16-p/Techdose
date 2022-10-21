class Robot {
    int width,height,x,y;
    String dir;
    public Robot(int width, int height) {
        this.width=width;
        this.height=height;
        x=0;
        y=0;
        dir="East";
    }
    
    public void step(int num) {
       num=num%(width*2+height*2-4);
       if(num==0){
           num=width*2+height*2-4;
       }
       for(int i=0;i<num;i++){
           if(dir.equals("East")){
               if(x==width-1){
                   y++;
                   dir="North";
               }
               else{
                   x++;
               }
           }
           else if(dir.equals("North")){
               if(y==height-1){
                   x--;
                   dir="West";
               }
               else{
                   y++;
               }
           }
           else if(dir.equals("West")){
               if(x==0){
                   y--;
                   dir="South";
               }
               else{
                   x--;
               }
           }
           else if(dir.equals("South")){
               if(y==0){
                   x++;
                   dir="East";
               }
               else{
                   y--;
               }
           }
       }
    }
    
    public int[] getPos() {
        int[] res = new int[2];
        res[0]=x;
        res[1]=y;
        return res;
    }
    
    public String getDir() {
        return dir;
    }
}
