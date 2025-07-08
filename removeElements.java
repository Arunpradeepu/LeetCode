class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next=head;
        ListNode temp = head;
        ListNode prev = dummyHead;

        while(temp != null){
            if(temp.val == val){
                prev.next = temp.next;
                         
            }
            else{
                prev = temp;
                
            }
            temp = temp.next;
            
            
            
        }
        return dummyHead.next;

    }
}