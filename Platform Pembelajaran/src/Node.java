public class Node {
    Node next, prev;
    Object data;

    Node (Node prev,Object data ,Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
