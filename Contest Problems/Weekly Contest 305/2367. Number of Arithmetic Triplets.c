

int arithmeticTriplets(int* nums, int numsSize, int diff){
        int count=0;
    for(int j=0;j<numsSize-2;j++){
       for(int index=j+1;index<numsSize;index++){
           for(int k=index+1;k<numsSize;k++){
           int f=nums[j];
           int s=nums[index];
           int t = nums[k];
           if((f<s)&&(s<t)&&((s-f)==diff)&&((t-s)==diff)){
               count=count+1;
           }
           }
       }
    }
    return count;
}
