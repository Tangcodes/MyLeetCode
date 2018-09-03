package reverselinkedlist;

import java.util.Stack;

public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
    /*
    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode ans = new ListNode(0);
        ListNode anss=ans;
        while(head!=null){
            stack.add(head);
            head=head.next;
        }
        while(!stack.isEmpty()) {
            ans.next = stack.pop();
            ans=ans.next;
        }
        return anss.next;
    }
    */
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(5);
        head.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=null;
        ListNode ans =  reverseList(head);
        for (int i=0;i<5;i++){
            System.out.println(ans.val);
            ans=ans.next;
        }
    }
    
}
