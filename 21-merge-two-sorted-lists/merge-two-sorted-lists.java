
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode list = new ListNode(0);
        // ListNode point = list;
        // // ListNode temp=obj;
        // // if (list1 != null || list2 != null) {
        // //     return (list1 == null) ? list2 : list1;
        // // }
        // while (list1 != null && list2 != null) {
        //     if (list1.val <= list2.val) {
        //         list.next = list1;
        //         list1 = list1.next;
        //     } else {
        //         list.next = list2;
        //         list2 = list2.next;
        //     }
        //     list = list.next;
        // }
        //     if (list1 == null) {
        //         list.next = list2;
        //     } 
        //     if (list2 == null) {
        //         list.next = list1;
        //     }

        // return point.next; 
        ListNode list = new ListNode(0);
        ListNode tail = list;
        while (list1 != null && list2 != null) {
            ListNode next = null;
            if (list1.val < list2.val) {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
            
        }
        if (list1 == null) {
            tail.next = list2;
        } else if (list2 == null) {
            tail.next = list1;
        }
        return list.next;
    }
}

// ListNode temp=new ListNode(0);
//         ListNode head=temp;
//         while(list1!=null && list2!=null){
//             if(list1.val<=list2.val){
//                 head.next=list1;
//                 list1=list1.next;
//             }
//             else{
//                 head.next=list2;
//                 list2=list2.next;
//             }
//                 head=head.next;
//         }
//         head.next=(list1==null)?list2:list1;
//         return temp.next;