package mergeksortedlists;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergekSortedLists {
    
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists==null || lists.length==0)return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                return (o1.val-o2.val);
                //if(o1.val<o2.val)return -1;
                //else if (o1.val==o2.val)return 0;
                //else return 1;
            }
        });
        
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
        
        while(!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
    
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode next1 = new ListNode(4);
        ListNode third1 = new ListNode(5);
        ListNode head2 = new ListNode(1);
        ListNode next2 = new ListNode(3);
        ListNode third2 = new ListNode(4);
        ListNode head3 = new ListNode(2);
        ListNode next3 = new ListNode(6);
        head1.next=next1;
        next1.next=third1;
        third1.next=null;
        head2.next=next2;
        next2.next=third2;
        third2.next=null;
        head3.next=next3;
        next3.next=null;
        ListNode[] lists=new ListNode[3];
        lists[0]=head1;
        lists[1]=head2;
        lists[2]=head3;
        ListNode ans = mergeKLists(lists);
        for (int i=0;i<8;i++){
            System.out.print(ans.val);
            ans=ans.next;
        }
    }
}
