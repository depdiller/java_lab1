package test_map;
import lab1.list.*;
import lab1.list.node.*;
import lab1.map.Map;
import lab1.map.mapPair.*;

public class TestMap {
    public static void main(String[] args) {
        Map aMap = new Map();
        aMap.put("hello", 2);
        aMap.put(55, "world");
        System.out.println(aMap.keyContains("hello"));
        aMap.printMap();
        aMap.put("hello", 4);
        aMap.printMap();

        Object tmp1 = aMap.remove("hello");
        aMap.printMap();
        System.out.println(tmp1);

        aMap.put("a", "b");
        aMap.put(7,"tutu");
        aMap.getKeys().printList();
        aMap.getValues().printList();
        aMap.getEntries().printList();
        // переопределить toString для нормального вывода
    }
}
