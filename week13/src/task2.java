import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(3);
        l1.print();
        deleteDuplicates(l1).print();
    }
    public static ListNode deleteDuplicates(ListNode head){
        ListNode dum=head;
        List<Integer> list=new ArrayList<>();
        list.add(head.val);
        while(head.next!=null){
            ListNode pos=head.next;

            if(!list.contains(pos.val)){
                list.add(pos.val);
                head=head.next;
            }
            else{
                    head.next=head.next.next;
            }
        }
        return dum;
    }
}
