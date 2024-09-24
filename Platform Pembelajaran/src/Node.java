public class Node {
    Node next, prev;
    Student data;

    Node (Node prev, Student data ,Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
