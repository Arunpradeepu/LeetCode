class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode cur = head;
        ListNode node1 = new ListNode(0);
        ListNode before=node1;
        ListNode node2 = new ListNode(0);
        ListNode after = node2;

        while(cur!=null){
            if(cur.val >= x){
                after.next = cur;
                after=after.next;
            }
            else{
                before.next = cur;
                before=before.next;
            }

            cur=cur.next;
        }
        after.next = null;
        before.next = node2.next;
        return node1.next;
    }
}