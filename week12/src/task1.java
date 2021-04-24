public class task1 {//反转链表
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        ListNode head=l1;
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        ListNode cru=l1;
        ListNode pre=null;
        System.out.println();
        while(cru!=null){
            ListNode next=cru.next;
            cru.next=pre;
            pre=cru;
            cru=next;
        }
        while(pre!=null){
            System.out.print(pre.val+" ");
            pre=pre.next;
        }
    }
}
