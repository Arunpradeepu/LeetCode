class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        int sum = 0;

        ListNode curr = head.next;

        while(curr.next != null){
            if(curr.val == 0){
                ListNode node = new ListNode(sum);
                temp.next = node;
                temp = temp.next;
                sum = 0;
            }
            else{
                sum += curr.val;
            }
            curr = curr.next;
        }

        if(sum > 0){
            ListNode node = new ListNode(sum);
            temp.next = node;
            temp = temp.next;
        }

        return ans.next;

    }
}