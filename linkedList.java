
// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }

// public static void display(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " ");
// temp = temp.next;
// }
// System.out.println();
// }

// }

// public class linkedList {
// public static void main(String[] args) {
// Node a = new Node(10);
// Node b = new Node(20);
// Node c = new Node(30);
// Node d = new Node(40);

// a.next = b;
// b.next = c;
// c.next = d;

// Node.display(a);
// }
// }

// reverse print

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }

// public static void displayReverse(Node head) {
// if (head == null) {
// return;
// }
// displayReverse(head.next);
// System.out.println(head.data);
// }
// }

// public class linkedList {
// public static void main(String[] args) {
// Node a = new Node(10);
// Node b = new Node(20);
// Node c = new Node(30);
// Node d = new Node(40);
// Node e = new Node(50);

// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;

// Node.displayReverse(a);

// }
// }

// length of a linkedlist print

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }

// public static int length(Node head) {
// int count = 0;
// while (head != null) {
// count++;
// head = head.next;
// }
// return count;
// }

// }

// public class linkedList {
// public static void main(String[] args) {
// Node a = new Node(10);
// Node b = new Node(20);
// Node c = new Node(30);
// Node d = new Node(40);
// Node e = new Node(50);

// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;

// System.out.println(Node.length(a));
// }
// }

// Linkedlist insertAtBegining

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// class linkedlistCustom {
// Node head = null;
// Node tail = null;

// public void insertAtEnd(int val) {
// Node temp = new Node(val);
// if (head == null) {
// head = temp;
// tail = temp;
// } else {
// tail.next = temp;
// tail = temp;
// }
// }

// public void display() {
// Node temp = head;
// while (temp != null) {
// System.out.println(temp.data);
// temp = temp.next;
// }
// }
// }

// public class linkedList {
// public static void main(String[] args) {
// linkedlistCustom ll = new linkedlistCustom();
// ll.insertAtEnd(10);
// ll.insertAtEnd(20);
// ll.insertAtEnd(30);
// ll.insertAtEnd(40);
// ll.insertAtEnd(50);

// ll.display();
// }
// }

// insertAtBegining

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// }
// }

// class linkedlistCustom {
// Node head = null;
// Node tail = null;

// public void insertAtBegining(int val) {
// Node temp = new Node(val);
// if (head == null) {
// head = temp;
// tail = temp;
// } else {
// temp.next = head;
// head = temp;
// }
// }

// public void display() {
// Node temp = head;
// while (temp != null) {
// System.out.println(temp.data);
// temp = temp.next;
// }
// }
// }

// public class linkedList {
// public static void main(String[] args) {
// linkedlistCustom ll = new linkedlistCustom();
// ll.insertAtBegining(10);
// ll.insertAtBegining(20);

// ll.display();
// }
// }

// insertAtBetween

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         // this.next = null;
//     }
// }

// class linkedCustom {
//     Node head = null;
//     Node tail = null;

//     public void insertAtEnd(int val) {
//         Node temp = new Node(val);

//         if (head == null) {
//             head = temp;
//             tail = head;
//         } else {
//             tail.next = temp;
//             tail = temp;
//         }
//     }

//     public void insertAtBetween(int index, int val) {
//         Node t = new Node(val);
//         Node temp = head;
//         for (int i = 0; i <= index - 1; i++) {
//             temp = temp.next;
//         }
//         t.next = temp.next;
//         temp.next = t;

//     }

//     public void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }

// public class linkedList {
//     public static void main(String[] args) {
//         linkedCustom ll = new linkedCustom();
//         ll.insertAtEnd(10);
//         ll.insertAtEnd(30);

//         // ll.insertAtBetween(2, 10);
//         ll.insertAtBetween(1, 20);

//         ll.display();
//     }
// }

//  method to return the elemeny at any given index of the linked list.

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class linkedCustom {
//     Node head = null;
//     Node tail = null;
//     int size = 0;

//     public void insertAtEnd(int val) {
//         Node temp = new Node(val);

//         if (head == null) {
//             head = temp;
//             tail = head;
//         } else {
//             tail.next = temp;
//             tail = temp;
//         }
//         size++;
//     }

//     public void insertAtBetween(int index, int val) {
//         Node t = new Node(val);
//         Node temp = head;
//         for (int i = 0; i < index - 1; i++) {
//             temp = temp.next;
//         }
//         t.next = temp.next;
//         temp.next = t;
//         size++;

//     }

//     public int getAt(int index) {
//         Node temp = head;
//         for (int i = 0; i <= index - 1; i++) {
//             temp = temp.next;
//         }
//         return temp.data;
//     }

//     public int size() {
//         return size;
//     }

//     public void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
// }

// public class linkedList {
//     public static void main(String[] args) {
//         linkedCustom ll = new linkedCustom();
//         ll.insertAtEnd(10);
//         ll.insertAtEnd(30);

//         // ll.insertAtBetween(2, 10);
//         ll.insertAtBetween(1, 20);
//         // ll.insertAtBetween(2, 40);

//         System.out.println("size of linkedList: " + ll.size());

//         ll.display();
//         // System.out.println("Value at index 1: " + ll.getAt(1));
//     }
// }

//  delete a element

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedCustom {
    Node head = null;
    Node tail = null;
    int size = 0;

    public void insertAtEnd(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = temp;
            tail = head;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void deleteAtBetween(int index) {
        Node temp = head;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
        size--;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class linkedList {
    public static void main(String[] args) {
        linkedCustom ll = new linkedCustom();
        ll.insertAtEnd(10);
        ll.insertAtEnd(30);

        ll.deleteAtBetween(1);

        ll.display();
        System.out.println("size of linked list is: " + ll.size());
        // System.out.println("Value at index 1: " + ll.getAt(1));
    }
}