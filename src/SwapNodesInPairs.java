
public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        ListNode nodes = head;
        while(nodes.next != null) {
            ListNode temp = nodes;
            nodes = nodes.next;
            nodes.next = temp;
            nodes = nodes.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        ListNode result1 = swapPairs(l1);

        System.out.println(result1);
    }
}
