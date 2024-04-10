public class ConvertToNode {
    public ListNode convertToListNode(int input){
        ListNode temp = new ListNode(0);
        ListNode tail = temp;

        while (input != 0){
            tail.next = new ListNode(input % 10);
            tail = tail.next;
            input /= 10;
        }
        return temp.next;
    }
}
