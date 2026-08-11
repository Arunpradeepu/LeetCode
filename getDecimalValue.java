class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int res = 0;
        int len = 0;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            len--;
            res = res + (temp.val * ((int)Math.pow(2,len))); 
            temp = temp.next;
        }

        return res;
    }
}