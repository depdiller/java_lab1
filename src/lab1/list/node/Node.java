package lab1.list.node;

public class Node {
    public Object data;
    public Node next;

    //empty constructor
    public  Node() {
        data = null;
        next = null;
    }

    public Node(Object aData) {
        data = aData;
        next = null;
    }

    public Object get() {
        return this.data;
    } 
}