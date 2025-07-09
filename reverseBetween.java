class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;

        for(int i=1;i<left;i++){
            prev=prev.next;                       
        }



        ListNode start = prev.next;
        ListNode temp = start;
        ListNode prevNode = null;

        for(int j=0; j< right-left+1; j++){
            ListNode front = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = front;
        }
        prev.next=prevNode;
        start.next=temp;

        return dummyNode.next;
    }
}