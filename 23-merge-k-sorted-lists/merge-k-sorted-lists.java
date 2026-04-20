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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0|| lists==null) return null;
        return mergeSort(lists,0,lists.length);
        
    }
    ListNode mergeSort(ListNode[] lists, int start, int end) {

    if (end - start == 1) {
        return lists[start];
    }

    int mid = start + (end - start) / 2;

    ListNode head1 = mergeSort(lists, start, mid);
    ListNode head2 = mergeSort(lists, mid, end);

    return sort(head1, head2);
}

ListNode sort(ListNode head1, ListNode head2) {

    ListNode newHead = new ListNode(0);
    ListNode temp = newHead;

    while (head1 != null && head2 != null) {

        if (head1.val <= head2.val) {
            temp.next = head1;
            head1 = head1.next;
        } else {
            temp.next = head2;
            head2 = head2.next;
        }

        temp = temp.next;
    }

    while (head1 != null) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }

    while (head2 != null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }

    return newHead.next;
}
}