package lab1.list;
import  lab1.list.node.*;

public class List {
    private int size;
    public Node head;

    public List() {
        this.size = 0;
        this.head = null;
    }

    public List(int size) {
        if (size > 0) {
            Node newNode = new Node();
            this.head = newNode;
            Node tmp = this.head;
            for (int i = 1; i < size; ++i) {
                newNode = new Node();
                tmp.next = newNode;
                tmp = tmp.next;
            }
            this.size = size;
        }
        else {
            this.size = 0;
            this.head = null;
        }
    }

    public void add(Object data) {
        if (this.size == 0) {
            this.head = new Node(data);
        }
        else {
            Node tmp = this.head;
            for (int i = 0; i < this.size - 1; ++i) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data);
        }
        ++this.size;
    }

    public boolean remove(int index) {
        // index from 0 to this.size - 1
        if (index < 0 || this.size == 0 || this.size <= index) {
            return false;
        }
        else {
            if (index == 0)
                this.head = this.head.next;
            else {
                Node tmp = this.head;
                for (int i = 0; i < index - 1; ++i)
                    tmp = tmp.next;
                Node tmp2 = tmp.next;
                tmp.next = tmp2.next;
            }
        }
        --this.size;
        return true;
    }

    public Node get(int index) {
        if (index < 0 || this.size == 0 || this.size <= index)
            return null;
        else {
            Node tmp = this.head;
            for (int i = 0; i < index; ++i)
                tmp = tmp.next;
            return tmp;
        }
    }

    public Node get(int index, Object data) {
        if (index < 0 || this.size == 0 || this.size <= index)
            return null;
        else {
            Node tmp = this.head;
            for (int i = 0; i < index; ++i)
                tmp = tmp.next;
            if (data.equals(tmp.data))
                return tmp;
            else
                return null;
        }
    }

    public int indexOf(Object data) {
        if (this.size != 0) {
            Node tmp = this.head;
            for (int i = 0; i < this.size; ++i) {
                if (data.equals(tmp.data))
                    return i;
                tmp = tmp.next;
            }
        }
        return -1;
    }

    public boolean contains(Object data) {
        Node tmp = this.head;
        for (int i = 0; i < this.size; ++i) {
            if (data.equals(tmp.data))
                return true;
            tmp = tmp.next;
        }
        return false;
    }

    public int size() { return this.size; }

    public boolean isEmpty() { return this.size == 0; }

    public void printList() {
        if (size > 0) {
            Node tmp = this.head;
            System.out.print("[");
            while (tmp != null) {
                if (tmp.next == null)
                    System.out.print(tmp.data);
                else
                    System.out.print(tmp.data + ", ");
                tmp = tmp.next;
            }
            System.out.println("]");
        }
        else
            System.out.println("Empty List");
    }
}
