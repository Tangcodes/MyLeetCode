package swapnodesinpairs;


public class SwapNodesinPairs {
    
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode swapPairs(ListNode head) {
        if (head ==null || head.next==null )return head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        
        ListNode current = dummy;
        while(current.next!=null && current.next.next!=null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }
    
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode third1 = new ListNode(3);
        ListNode forth1 = new ListNode(4);
        head1.next=next1;
        next1.next=third1;
        third1.next=forth1;
        forth1.next=null;
        ListNode ans = swapPairs(head1);
        for (int i=0;i<4;i++){
            System.out.print(ans.val);
            ans=ans.next;
        }
    }
}
