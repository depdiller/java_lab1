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

        bList.add(2);
        bList.add(4);
        bList.add(9);
        bList.add(10);
        bList.printList();

        aList.merge(bList.head).printList();
    }
}
