#include <stdlib.h>
#include <stdio.h>

struct ListNode {
  int val;
  struct ListNode *next;
};

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
  struct ListNode head;  
  struct ListNode *val = &head;
  if (list1 == NULL && list2 == NULL) {
    return NULL;
  }
  else if (list1 == NULL) {
    return list2;
  }
  else if (list2 == NULL) {
    return list1;
  }

  while (list1 && list2) {
    if (list1->val < list2->val) {
      val->next = list1;
      list1 = list1->next;
    }
    else {
      val->next = list2; 
      list2 = list2->next;
    }

    val = val->next;

  }
  if (list1 != NULL) {
    val->next = list1; 
  }
  if (list2 != NULL) {
    val->next = list2;
  }
  return (&head)->next;
    
} 


int main() {
    
  printf("hello");

}
