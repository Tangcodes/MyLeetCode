package rotatelist;

public class RotateList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode rotateRight(ListNode head, int k) {
        if (head==null||head.next==null) return head;
        ListNode copyHead = new ListNode(0);
        copyHead=head;
        int len=1;
        while (copyHead.next!=null){
            len++;
            copyHead=copyHead.next;
        }
        copyHead.next=head;
        for (int i = len - k % len; i > 1; i--){
            head=head.next;
        }
        copyHead=head.next;
        head.next=null;
        return copyHead;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode next = new ListNode(1);
        ListNode third = new ListNode(2);
        //ListNode forth = new ListNode(4);
        //ListNode fif = new ListNode(5);
        head.next=next;
        next.next=third;
        third=null;
        //third.next=forth;
        //forth.next=fif;
        //fif.next=null;
        int k=4;
        ListNode ans = rotateRight(head,k);
        for (int i=0;i<3;i++){
            System.out.print(ans.val);
            ans=ans.next;
        }
    }
}
