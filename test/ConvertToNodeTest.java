import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToNodeTest {

    public ConvertToNode node = new ConvertToNode();
    ListNode nod = node.convertToListNode(709);

    @Test
    void convertToListNode() {
        assertEquals(9, nod.val);
    }

    @Test
    void convertToListNode2() {
        nod = nod.next;
        assertEquals(0, nod.val);
    }

    @Test
    void convertToListNode3() {
        nod = nod.next.next;
        assertEquals(7, nod.val);
    }

    @Test
    void convertToListNode4() {
        nod = nod.next.next.next;
        assertNull(nod);
    }
}