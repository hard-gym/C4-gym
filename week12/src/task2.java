public class task2 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        ListNode head1=l1;
        ListNode head2=n1;
        ListNode listNode=new ListNode(0);
        ListNode real=listNode;
        while (head1!=null&&head2!=null){
            if(head1.val<=head2.val){
                listNode.next=head1;
                head1=head1.next;
            }
            else{
                listNode.next=head2;
                head2=head2.next;
            }
            listNode=listNode.next;
        }
//        listNode.next = head1 != null ? head1 : head2;
        while (real.next!=null){
            System.out.println(real.next.val);
            real=real.next;
        }
    }
}
