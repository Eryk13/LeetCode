
public class ListNode {
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