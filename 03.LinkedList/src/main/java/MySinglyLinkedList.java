public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
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


}
