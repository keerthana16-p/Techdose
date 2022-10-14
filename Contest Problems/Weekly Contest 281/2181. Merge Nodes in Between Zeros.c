struct ListNode* mergeNodes(struct ListNode* head){
      struct ListNode *start = head;
      int sum; 
      while(start->next!=NULL){
          struct ListNode * temp = start->next;
          sum=0;
          while(temp->val!=0){
              sum=sum+temp->val;
              temp=temp->next;
          }
          sum+=temp->val;
          (start->next)->val=sum;
          (start->next)->next=temp->next;
          start=temp;
      }
    return head->next;
}
