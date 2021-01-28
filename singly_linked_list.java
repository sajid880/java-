public class singlyLinkedList
{
    private ListNode head; // Head node to hold the list

    //it contains a static inner class ListNode
    private static class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String args[])
    {
        // Here we r creating linked list
        //14--> 6--> 8--> 16--> null
        //14 as Head node of Linked list
        ListNode head = new ListNode(14);
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(16);
        
    }
}