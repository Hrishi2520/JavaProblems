public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            while(temp.next != null && temp.next.val == temp.val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}