package test_listMerge;
import lab1.list.List;
import lab2.list_int.*;

public class TestListMerge {
    public static void main(String[] args) {
        ListInt aList = new ListInt();
        ListInt bList = new ListInt();

        aList.add(1);
        aList.add(5);
        aList.add(7);
        aList.add(8);
        aList.printList();

        aList.add(2);
        aList.add(4);
        aList.add(9);
        aList.add(10);
        aList.printList();

        aList.merge(bList.head).printList();
    }
}
