class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next=head;
        ListNode prev=dummyHead;
        

        while(prev.next!=null && prev.next.next!=null){

        ListNode fast = prev.next.next;
        ListNode slow = prev.next;
        ListNode nextpair = fast.next;

        prev.next=fast;
        fast.next=slow;
        slow.next=nextpair;

        prev=prev.next.next;

        }
        return dummyHead.next;
    }
}