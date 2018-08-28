package partitionlist;

public class PartitionList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0), right = new ListNode(0);  //dummy heads of the 1st and 2nd queues
        ListNode curr1 = left, curr2 = right;      //current tails of the two queues;
        while (head!=null){
            if (head.val<x) {
                curr1.next = head;
                curr1 = head;
            }else {
                curr2.next = head;
                curr2 = head;
            }
            head = head.next;
        }
        curr2.next = null;          //important! avoid cycle in linked list. otherwise u will get TLE.
        curr1.next = right.next;
        return left.next;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(2);
        ListNode fif = new ListNode(5);
        ListNode six = new ListNode(2);
        head.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fif;
        fif.next=six;
        six.next=null;
        int x=3;
        ListNode ans = partition(head,x);
        for (int i=0;i<6;i++){
            System.out.print(ans.val);
            ans=ans.next;
        }
    }
}
