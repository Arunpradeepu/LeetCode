class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        for(int val : nums){
            set.add(val);
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while(prev.next != null){
            if(set.contains(prev.next.val)){
                prev.next = prev.next.next;
            }
            else{
                prev = prev.next;
            }
        }

        return dummy.next;
    }
}