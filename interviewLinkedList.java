//  can we delete a node given the node itself as parameter?
// is there any efficient way, provided that the given node is not the last node?

//  finding nth node from the end of the linkedlist

// public class interviewLinkedList {

//     public static Node nthNode(Node head, int n) {
//         // int size = 0;
//         // Node temp = head;
//         // while (temp != null) {
//         // size++;
//         // temp = temp.next;
//         // }
//         // int m = size - n + 1;
//         // // mth node from start
//         // temp = head;
//         // for (int i = 0; i < m - 1; i++) {
//         // temp = temp.next;
//         // }
//         // return temp;

//         Node slow = head;
//         Node fast = head;
//         for (int i = 0; i < n; i++) {
//             fast = fast.next;
//         }
//         while (fast != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }
//         return slow;
//     }

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static void main(String[] args) {
//         Node a = new Node(10);
//         Node b = new Node(20);
//         Node c = new Node(30);
//         Node d = new Node(40);
//         Node e = new Node(50);
//         Node f = new Node(60);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         e.next = f;

//         Node q = nthNode(a, 3);
//         System.out.println(q.data);
//     }
// }

//  removing nth node from th end of linkedlist

public class interviewLinkedList {
    public static Node nthNodeRemove(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        a = nthNodeRemove(a, 6);
        display(a);

    }
}