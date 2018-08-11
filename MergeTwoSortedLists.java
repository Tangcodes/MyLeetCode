package mergetwosortedlists;

public class MergeTwoSortedLists {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
     public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        
        if (l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next=mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode third1 = new ListNode(4);
        ListNode head2 = new ListNode(1);
        ListNode next2 = new ListNode(3);
        ListNode third2 = new ListNode(4);
        head1.next=next1;
        next1.next=third1;
        third1.next=null;
        head2.next=next2;
        next2.next=third2;
        third2.next=null;
        ListNode ans = mergeTwoLists(head1,head2);
        for (int i=0;i<6;i++){
            System.out.print(ans.val);
            ans=ans.next;
        }
    }
    
}
