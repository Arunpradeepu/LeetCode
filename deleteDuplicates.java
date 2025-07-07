class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(-1);
        ListNode prev = dummyHead;
        dummyHead.next=head;

        while(head!=null && head.next!=null){
            if( head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                                        
                }
                prev.next=head.next;
            }
            else{
                
                prev=prev.next;
            }
            head=head.next;

        }  
        return dummyHead.next;  
    }
}