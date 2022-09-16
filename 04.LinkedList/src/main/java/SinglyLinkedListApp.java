public class SinglyLinkedListApp {
    public static void main(String[] args) {
        MySinglyLinkedList myList = new MySinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNodes();
//        myList.deleteById(0);
//        myList.printNodes();
        System.out.println(myList.indexOf(9));

        System.out.println("---------------");
        System.out.println(myList.getKthFromLast(4));

        myList.removeKthItemFromLast(4);
        myList.printNodes();

    }
}
