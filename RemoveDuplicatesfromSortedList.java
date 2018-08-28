package removeduplicatesfromsortedlist;


public class RemoveDuplicatesfromSortedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            if (cur.next.val==cur.val){
                cur.next=cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(2);
        ListNode forth = new ListNode(3);
        ListNode fif = new ListNode(4);
        head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fif;
        fif.next=null;
        ListNode ans = deleteDuplicates(head);
        for (int i=0;i<4;i++){
            System.out.print(ans.val);
            ans=ans.next;
        }
    }
    
}
