public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result;
        int carry = 0;
        int value1;
        int value2;

        ListNode temp = new ListNode();
        ListNode tail = temp;

        while (l1 != null || l2 != null || carry != 0){

            if (l1 != null){value1 = l1.val;}else {value1=0;}
            if (l2 != null){value2 = l2.val;}else {value2=0;}

            result = value1 + value2 + carry;
            carry = result / 10;

            if (l1 != null){l1 = l1.next;}
            if (l2 != null){l2 = l2.next;}

            tail.next = new ListNode(result % 10);
            tail = tail.next;
        }

        return temp.next;
    }
}
