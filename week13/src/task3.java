import java.util.HashSet;

public class task3 {
    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(0);
        ListNode n3=new ListNode(-4);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n1;
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head){
        HashSet<Integer> set=new HashSet<>();
        while (head!=null){
            if(!set.add(head.val)){
                return true;
            }
            head=head.next;
        }
        return false;
    }
}
