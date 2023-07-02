class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();

        ListNode listNode = solution1.addTwoNumbers(
                new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4)))
        );

        System.out.println(listNode);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode node = result;

        while (l1 != null || l2 != null) {
            int first = l1 != null ? l1.val : 0;
            int second = l2 != null ? l2.val : 0;

            int sum = first + second + node.val;

            int calc = sum / 10;
            if (calc == 0) {
                node.val = sum;
            } else {
                node.val = sum % 10;
                node.next = new ListNode(calc);
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            if (l1 != null || l2 != null) {
                if (node.next == null) {
                    node.next = new ListNode();
                }
                node = node.next;
            }
        }

        return result;
    }
}