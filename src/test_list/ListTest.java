package test_list;
import lab1.list.*;
import lab1.list.node.*;

public class ListTest {
    public static void main(String[] args) {
        List aList = new List(5);
        List bList = new List();

        bList.add("Hello");
        bList.add("world");

        bList.printList();
        bList.remove(0);
        bList.printList();

        Node aNode = bList.get(0);
        System.out.println(aNode.data);

        bList.add(5);
        bList.printList();
        int i1 = bList.indexOf(5);
        int i2 = bList.indexOf("world");
        int i3 = bList.indexOf(100);
        System.out.println(i1 + " " + i2 + " " + i3);

        System.out.println(bList.contains("world") + " " +
                bList.contains(6));

        Node bNode = bList.get(0, "Hello");
        if (bNode != null)
            System.out.println(bNode.data);
        else
            System.out.println("No such node");


        System.out.println(aList.size() + " "+ bList.size());

        System.out.println(aList.isEmpty() + " " + bList.isEmpty());
        // если лист забит нулями он Empty - пока что да
    }
}
