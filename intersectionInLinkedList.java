public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

       
        ListNode t1= headA;
        ListNode t2= headB;

        

        while(t1!=t2){

            if(t1==null){
                t1=headB;
            }
            else{
                t1=t1.next;
            }

            if(t2==null){
                t2=headA;
            }

            else{
                t2=t2.next;
            }
            
            
            if(t1==t2){
                return t1;
            }

        }
        return t1;
        

    }
}