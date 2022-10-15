int pairSum(struct ListNode* head){
      struct ListNode * temp=head;
      int c=0; 
      while(temp!=NULL){
          temp=temp->next;
          c++;
      }
    int arr[c],i=0;
    temp=head;
    while(temp!=NULL){
        arr[i++]=temp->val;
        temp=temp->next;
    }
    int max=INT_MIN;
    for(int i=0;i<c/2;i++){
        int sum=arr[i]+arr[c-i-1];
        if(sum>max){
            max=sum;
        }
    }
    return max;
}
