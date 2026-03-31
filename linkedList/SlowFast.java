class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SlowFast {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;

        for (int i = 2; i < 11; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }

        Node n = head;

        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }

        System.out.println(n.data);
        n.next = head;
    }
}
