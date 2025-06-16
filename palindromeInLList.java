class Solution {
        ListNode reversell(ListNode head){
            if(head==null||head.next==null){
                return head;
            }
            ListNode newHead=reversell(head.next);
            ListNode front=head.next;
            front.next=head;
            head.next=null;
            return newHead;
        }    
        public boolean isPalindrome(ListNode head) {
            if(head==null||head.next==null){
                return true;
            }
            ListNode slow=head;
            ListNode fast=head;

            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;                
            }
            ListNode newNode=reversell(slow);
            ListNode first=head;
            ListNode second=newNode;
            while(second!=null){
                if(first.val!=second.val){
                    reversell(newNode);
                    return false;

                }
                first=first.next;
                second=second.next;
            }
            reversell(newNode);
            return true;


        
        }
}