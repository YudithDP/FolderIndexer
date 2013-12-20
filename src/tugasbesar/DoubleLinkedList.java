package tugasbesar;

class Elemen {

    String data;
    String path;
    Elemen next;
    Elemen prev;
}

public class DoubleLinkedList {

    Elemen head;
    Elemen tail;

    boolean isEmpty() {
        return (head == null & tail == null);
    }

    void IsiNext(String data, String path) {
        Elemen tmp = new Elemen();
        tmp.data = data;
        tmp.path = path;

        if (isEmpty()) {
            head = tmp;
            tail = tmp;
        } else {
            tail.next = tmp;
            tmp.prev = head;
        }
        tail = tmp;

    }

    void cariPath(String data) {
        Elemen tmp = head;

        while (tmp != null) {
            if (tmp.data.contains(data)) {
            System.out.println(tmp.path);
            }
            tmp = tmp.next;
        }
    }

}
