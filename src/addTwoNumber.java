public class addTwoNumber {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode sol = new ListNode();
       ListNode head = sol;
       int val_1;
       int val_2;
       boolean remainder = false;
       boolean adder = false;
       while (l1 != null || l2 != null) {
        sol.next = new ListNode();
           sol = sol.next;
           val_1 = 0;
           val_2 = 0;
           if (l1 != null) {
               val_1 = l1.val;
               l1 = l1.next;
               System.out.print(val_1);
               if (l2 == null && l1 == null) {
                   adder = true;
               }
           }
           if (l2 != null) {
               val_2 = l2.val;
               l2 = l2.next;
               System.out.println(", " + val_2);
               if (l1 == null && l2 == null) {
                   adder = true;
               }
           }
           if (remainder == true) {
                sol.val = (val_1 + val_2 + 1) % 10;
                if (val_1 +val_2 +1 >= 10) {

                }
                else {
                    remainder =false;
                }
                System.out.println("*"+sol.val);
           }
           else {
               sol.val = (val_1 + val_2) % 10;
               if (val_1 +val_2 >= 10) {
                   remainder = true;
                }
                System.out.println("*"+sol.val);
           }
           if (adder && remainder) {
               sol.next = new ListNode();
               sol = sol.next;
               sol.val = 1;
           }
           
           
           
           
       }
       return head.next; 
    }
}
}
