// Last updated: 7/31/2026, 9:30:22 AM
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode dummyHead = new ListNode(0);
4        ListNode curr = dummyHead;
5        int carry = 0;
6        
7        while (l1 != null || l2 != null || carry != 0) {
8            int val1 = (l1 != null) ? l1.val : 0;
9            int val2 = (l2 != null) ? l2.val : 0;
10            
11            int sum = val1 + val2 + carry;
12            carry = sum / 10;
13            
14            curr.next = new ListNode(sum % 10);
15            curr = curr.next;
16            
17            if (l1 != null) l1 = l1.next;
18            if (l2 != null) l2 = l2.next;
19        }
20        
21        return dummyHead.next;
22    }
23}