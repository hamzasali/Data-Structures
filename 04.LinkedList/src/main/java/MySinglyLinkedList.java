public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
            System.out.println(head);
            System.out.println(tail);
            System.out.println(node);
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.next == null) System.out.println(current.id + "=> null");
            else {
                System.out.print(current.id + "=>");

            }
            current = current.next;
        }
    }

    void deleteById(int id) {
        //check if empty
        if (isEmpty()) System.out.println("List is empty");
        //assign prev and current with head
        Node prev = head;
        Node current = head;
        while (current != null) {
            if (current.id == id) {//there is match
                //case 1: head
                if (current == head) {
                    head = current.next;
                    current.next = null;
                }
                //case 2: tail
                if (current == tail) {
                    tail = prev;
                    prev.next = null; // tail will be eligible for GC
                }
                //case 3: middle
                else {
                    prev.next = current.next;
                    current.next = null; // current will be eligible for GC
                }
                // after deletion
                size--;
            }
            // move forward on the elements of the list
            prev = current;
            current = current.next;
        }
    }

    int indexOf(int id) {
        if (isEmpty()) return -1;
        int pos = 0;
        //iterate through the list
        Node current = head;
        while (current != null) {
            if (current.id == id) return pos;
            pos++;
            current = current.next;
        }
        return -1;
    }

    public int getKthFromLast(int k) {
        Node pointer1 = head;
        Node pointer2 = head;
        for (int i = 0; i < k - 1; i++) {
            pointer2 = pointer2.next;
        }
        while (pointer2 != null) {
            pointer2 = pointer2.next;
            pointer1 = pointer1.next;
        }
        return pointer1.id;
    }

    void removeKthItemFromLast(int k) {

        Node pointer1 = head;
        Node pointer2 = head;
        Node prev = null;
        for (int i = 0; i < k - 1; i++) {
            pointer2 = pointer2.next;
        }
        while (pointer2 != null) {
            prev = pointer1;
            pointer2 = pointer2.next;
            pointer1 = pointer1.next;
        }
        if (pointer1 == head) {
            head = pointer1.next;
            pointer1.next = null;
            size--;
        } else if (pointer1 == tail) {
            tail = prev;
            prev.next = null;
            size--;
        } else {
            prev.next = pointer1.next;
            pointer1.next = null;
            size--;
        }

    }

}
