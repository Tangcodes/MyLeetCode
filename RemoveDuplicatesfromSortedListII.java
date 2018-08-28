package removeduplicatesfromsortedlistii;

public class RemoveDuplicatesfromSortedListII {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                cur=cur.next;
            }
            if(pre.next==cur){
                pre=pre.next;
            }
            else{
                pre.next=cur.next;
            }
            cur=cur.next;
        }
        return FakeHead.next;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(3);
        ListNode fif = new ListNode(4);
        head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fif;
        fif.next=null;
        ListNode ans = deleteDuplicates(head);
        for (int i=0;i<3;i++){
            System.out.print(ans.val);
            ans=ans.next;
        }
    }
    
}
