import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public Solution add2 = new Solution();
    public ConvertToNode convert = new ConvertToNode();

    @Test
    void addTwoNumbers() {
        ListNode v1_3 = new ListNode(3);
        ListNode v1_2 = new ListNode(4, v1_3);
        ListNode v1_1 = new ListNode(2, v1_2);

        ListNode v2_3 = new ListNode(4);
        ListNode v2_2 = new ListNode(6, v2_3);
        ListNode v2_1 = new ListNode(5, v2_2);

        ListNode Ans_3 = new ListNode(8);
        ListNode Ans_2 = new ListNode(0, Ans_3);
        ListNode Ans_1 = new ListNode(7, Ans_2);

        ListNode res = add2.addTwoNumbers(v1_1, v2_1);

        assertEquals(Ans_1.val, res.val);
    }

    @Test
    void addingListNode(){
        ListNode value1 = convert.convertToListNode(342);
        ListNode value2 = convert.convertToListNode(465);
        ListNode ans = convert.convertToListNode(807);
        assertEquals(ans.val, add2.addTwoNumbers(value1, value2).val);
        assertEquals(ans.next.val, add2.addTwoNumbers(value1, value2).next.val);
        assertEquals(ans.next.next.val, add2.addTwoNumbers(value1, value2).next.next.val);
    }

    @Test
    void addingListNode2(){
        ListNode value1 = convert.convertToListNode(9999999);
        ListNode value2 = convert.convertToListNode(9999);
        ListNode ans = convert.convertToListNode(10009998);
        assertEquals(ans.val, add2.addTwoNumbers(value1, value2).val);
        assertEquals(ans.next.val, add2.addTwoNumbers(value1, value2).next.val);
        assertEquals(ans.next.next.val, add2.addTwoNumbers(value1, value2).next.next.val);
    }
}