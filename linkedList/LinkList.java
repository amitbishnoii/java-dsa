class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkList {
    public static void main(String[] args) {

        // Node temp = head;

        // System.out.println("before insertion");
        // while (temp.next != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // insert at start
        // Node newNode = new Node(99);
        // newNode.next = head;
        // head = newNode;

        // Node temp2 = head;

        // System.out.println("after insertion");
        // while (temp2.next != null) {
        // System.out.println(temp2.data);
        // temp2 = temp2.next;
        // }

        // insert at end
        // Node newNode1 = new Node(-1);
        // Node temp1 = head;
        // while (temp1.next != null) {
        // temp1 = temp1.next;
        // }
        // temp1.next = newNode1;

        // Node temp2 = head;

        // System.out.println("after insertion at end");
        // while (temp2 != null) {
        // System.out.println(temp2.data);
        // temp2 = temp2.next;
        // }

        // insert at 2nd position

        // Node temp = head;
        // Node newNode = new Node(19);

        // System.out.println("after inserting at 2nd");

        // newNode.next = temp.next;
        // temp.next = newNode;

        // while (temp.next != null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }

        // insert at Kth position
        Node head = new Node(0);
        Node a = head;

        for (int i = 1; i < 11; i++) {
            a.next = new Node(i);
            a = a.next;
        }

        Node newNode = new Node(123);
        int k = 4;

        Node temp = head;
        int count = 0;
        while (count < k - 1) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        Node temp1 = head;

        while (temp1.next != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
    }
}