// Last updated: 7/14/2026, 9:25:24 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13
14        ListNode dummy = new ListNode(0);
15
16        ListNode temp = head;
17
18        int size = 0;
19
20        while(temp != null){
21            temp = temp.next;
22            size++;
23        }
24
25        temp = dummy;
26
27        n = size - n + 1;
28
29        for(int i = 1; i < n; i++){
30
31            temp.next = head;
32            temp = temp.next;
33            head = head.next;
34        }
35
36        temp.next = head.next;
37
38        return dummy.next;
39    }
40}