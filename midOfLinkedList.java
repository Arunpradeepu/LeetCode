class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int cnt=0;
      

        while(temp!=null){            
            temp=temp.next;
            cnt++;
        }

        int midNode=(cnt/2);
        temp = head;
        while(temp!=null && midNode!=0){
            midNode = midNode-1;
            temp=temp.next;            
        }
        return temp;    
       
        
    }
}