class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode dummyhead=new ListNode(-1);
        ListNode cur=dummyhead;
        int carry = 0;

        while(t1!=null||t2!=null){
            int sum = carry;
            if(t1!=null){
                 sum = sum + t1.val;
            }

            if(t2!=null){
                sum = sum + t2.val;
            }

            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;
            cur.next=newNode;
            cur=cur.next;

            if(t1!=null){
                t1=t1.next;
            }
            if(t2!=null){
                t2=t2.next;
            }

            if(carry>0){
                ListNode newNode1=new ListNode(carry);
                cur.next=newNode1;
            }
        }
        return dummyhead.next;
    }
}