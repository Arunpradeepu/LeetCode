class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode dummyhead = new ListNode(-1);
        ListNode cur = dummyhead;

        while(t1!=null && t2!=null){
            if(t1.val <= t2.val){
                cur.next=t1;
                t1=t1.next;
            }

            else{
                cur.next=t2;
                t2=t2.next;
            }
            cur=cur.next;
            
            
        }

        if(t1!=null){
                cur.next=t1;
            }
        else{
                cur.next=t2;
            }

        return dummyhead.next;

    }
}