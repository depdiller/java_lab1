package lab2.list_int;
import lab1.list.node.Node;
import lab2.node_int.*;

public class ListInt {
    private int size;
    public NodeInt head;

    public ListInt() {
        this.size = 0;
        this.head = null;
    }

    public ListInt(int size) {
        if (size > 0) {
            NodeInt newNode = new NodeInt();
            this.head = newNode;
            NodeInt tmp = this.head;
            for (int i = 1; i < size; ++i) {
                newNode = new NodeInt();
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

    public void add(int data) {
        if (this.size == 0) {
            this.head = new NodeInt(data);
        }
        else {
            NodeInt tmp = this.head;
            for (int i = 0; i < this.size - 1; ++i) {
                tmp = tmp.next;
            }
            tmp.next = new NodeInt(data);
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
                NodeInt tmp = this.head;
                for (int i = 0; i < index - 1; ++i)
                    tmp = tmp.next;
                NodeInt tmp2 = tmp.next;
                tmp.next = tmp2.next;
            }
        }
        --this.size;
        return true;
    }

    public NodeInt get(int index) {
        if (index < 0 || this.size == 0 || this.size <= index)
            return null;
        else {
            NodeInt tmp = this.head;
            for (int i = 0; i < index; ++i)
                tmp = tmp.next;
            return tmp;
        }
    }

    public NodeInt get(int index, int data) {
        if (index < 0 || this.size == 0 || this.size <= index)
            return null;
        else {
            NodeInt tmp = this.head;
            for (int i = 0; i < index; ++i)
                tmp = tmp.next;
            if (data == tmp.data)
                return tmp;
            else
                return null;
        }
    }

    public int indexOf(int data) {
        if (this.size != 0) {
            NodeInt tmp = this.head;
            for (int i = 0; i < this.size; ++i) {
                if (data == tmp.data)
                    return i;
                tmp = tmp.next;
            }
        }
        return -1;
    }

    public boolean contains(int data) {
        NodeInt tmp = this.head;
        for (int i = 0; i < this.size; ++i) {
            if (data == tmp.data)
                return true;
            tmp = tmp.next;
        }
        return false;
    }

    public int size() { return this.size; }

    public boolean isEmpty() { return this.size == 0; }

    public void printList() {
        if (size > 0) {
            NodeInt tmp = this.head;
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

    public ListInt merge(NodeInt h1) {
        ListInt merged = new ListInt();
        NodeInt tmp1 = h1;
        NodeInt tmp2 = this.head;
        while (tmp1 != null && tmp2 != null) {
            if (tmp1.data <= tmp2.data) {
                merged.add(tmp1.data);
                tmp1 = tmp1.next;
            }
            else {
                merged.add(tmp2.data);
                tmp2 = tmp2.next;
            }
        }
        if (tmp1 == null) {
            while (tmp2 != null) {
                merged.add(tmp2.data);
                tmp2 = tmp2.next;
            }
        }
        else {
            while (tmp1 != null) {
                merged.add(tmp1.data);
                tmp1 = tmp1.next;
            }
        }
        return merged;
    }
}
