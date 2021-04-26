public class task1 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.add(2);
        l1.add(4);
        l1.print();
        ListNode l2=new ListNode(1);
        l2.add(3);
        l2.add(4);
        l2.print();
        mergeTwoLists(l1,l2).print();
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head=new ListNode(0);
        ListNode dum=head;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val) {
                head.next = l1;
                l1=l1.next;
            }
            else {
                head.next = l2;
                l2=l2.next;
            }
            head=head.next;
        }
        head.next= l1!=null?l1:l2;
        return dum.next;
    }
}
