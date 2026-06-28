class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;

        if(curr.val >= 5){
            ListNode newNode = new ListNode(1);
            newNode.next = head;
            head = newNode;
        }

        while(curr != null){
            if(curr.next == null || curr.next.val < 5){
                curr.val = ((curr.val * 2) % 10);
            }

            else if(curr.next.val >= 5){
                curr.val = ((curr.val * 2) % 10) + 1;
            }

            curr = curr.next;
        }

        return head;
    }
}