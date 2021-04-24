import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(2);
        ListNode l4=new ListNode(1);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        ListNode node=l1;
        List<Integer> list=new ArrayList<>();
        while(node!=null){
            list.add(node.val);
            node=node.next;
        }
        boolean flag=true;
        for (int i = 0; i < list.size()/2; i++) {
            if(list.get(i)!=list.get(list.size()-i-1))
            flag=false;
        }
        System.out.println(flag);
    }
}
