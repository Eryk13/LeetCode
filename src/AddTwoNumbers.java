
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder str = new StringBuilder();
        do{
            str.append(node.val)
                    .append(" ");
            node = node.next;
        }while(node!= null);

        return str.toString();
    }
}

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //2,4,3
        //5,6,4
        //7,0,8
        ListNode head = null;
        ListNode result = null;
        int r = 0;

        while(l1 != null || l2 !=null){
            int sum = r;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode node =  new ListNode(sum % 10);
            r = sum / 10;

            if(result == null) {
                result = node;
                head = node;
            }
            else {
                result.next = node;
                result = result.next;
            }
        }
        if(r > 0) {
            result.next = new ListNode(r);
        }

        return head;

    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);

        ListNode l5 = new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode result = addTwoNumbers(l1,l2);
        ListNode result2 = addTwoNumbers(l3,l4);
        ListNode result3 = addTwoNumbers(l5, l6);

        System.out.println(result.toString());
        System.out.println(result2.toString());
        System.out.println((result3));
    }
}
