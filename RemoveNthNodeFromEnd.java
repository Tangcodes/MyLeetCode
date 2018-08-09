package removenthnodefromend;


public class RemoveNthNodeFromEnd {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        int N=0;
        ListNode first = head;
        while(first!=null){
            N++;
            first=first.next;
        }
        N=N-n;
        first=dummy;
        while(N>0){
            first=first.next;
            N--;
        }
        first.next=first.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next=next;
        next.next=third;
        third.next=forth;
        forth.next=fifth;
        fifth.next=null;
        ListNode ans = removeNthFromEnd(head, 2);
        for (int i=0;i<4;i++){
            System.out.print(ans.val);
            ans=ans.next;
        }
    }
}
