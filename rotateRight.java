class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;

        if(head==null||head.next==null||k==0){
            return head;
        }

        int len=0;
        while(temp!=null){
            len+=1;
            temp=temp.next;
        }

        
        k=k%len;

        if(k==0){
            return head;
        }



        for(int i=0;i<k;i++){
            fast=fast.next;
        }

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        ListNode newHead = slow.next;
        slow.next=null;
        fast.next=head;

        return newHead; 
        
    }
}