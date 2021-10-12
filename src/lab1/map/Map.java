package lab1.map;
import lab1.list.*;
import lab1.list.node.*;
import lab1.map.mapPair.*;

public class Map {
    private int size;
    private List mapList;

    public Map() {
        this.mapList = new List();
        this.size = 0;
    }

    public List getMapList() {
        return this.mapList;
    }

    public void put(Object key, Object value) {
        /* check if there is already pair with such key
        and replace it */
        Node tmp = this.keyNode(key);
        if (tmp != null) {
            ((MapPair) tmp.data).value = value;
        }
        else {
            MapPair newPair = new MapPair(key, value);
            this.mapList.add(newPair);
            ++this.size;
        }
    }

    public boolean keyContains(Object key) {
        Node tmp = mapList.head;
        while (tmp != null) {
            if (((MapPair) tmp.data).getKey().equals(key))
                return true;
            tmp = tmp.next;
        }
        return false;
    }

    public Node keyNode(Object key) {
        Node tmp = mapList.head;
        while (tmp != null) {
            if (((MapPair) tmp.data).getKey().equals(key))
                return tmp;
            tmp = tmp.next;
        }
        return null;
    }

    public void printMap() {
        System.out.print("{");
        Node tmp = this.mapList.head;
        while (tmp != null) {
            if (tmp.next == null)
                System.out.print(((MapPair)tmp.data).key + ":" + ((MapPair)tmp.data).value);
            else
                System.out.print(((MapPair)tmp.data).key + ":" + ((MapPair)tmp.data).value + ", ");
            tmp = tmp.next;
        }
        System.out.println("}");
    }

    public Object get(Object key) {
        Node tmp = keyNode(key);
        if (tmp != null) {
            return ((MapPair) tmp.data).key;
        }
        return null;
    }

    public Object get(Object key, Object bydefault) {
        Node tmp = keyNode(key);
        if (tmp != null) {
            return ((MapPair) tmp.data).key;
        }
        return bydefault;
    }

    public Object remove(Object key) {
        int delInd = indexOfNode(key);
        Node tmp;
        if (delInd != -1) {
            tmp = this.mapList.get(delInd);
            this.mapList.remove(delInd);
            return ((MapPair) tmp.data).value;
        }
        else
            return null;
    }

    private int indexOfNode(Object key) {
        Node tmp = mapList.head;
        for (int i = 0; i < this.size; ++i) {
            if (((MapPair) tmp.data).getKey().equals(key))
                return i;
            tmp = tmp.next;
        }
        return -1;
    }

    public List getKeys() {
        List keys = new List();
        Node tmp = mapList.head;
        while (tmp != null) {
            keys.add(((MapPair) tmp.data).key);
            tmp = tmp.next;
        }
        return keys;
    }

    public List getValues() {
        List values = new List();
        Node tmp = mapList.head;
        while (tmp != null) {
            values.add(((MapPair) tmp.data).value);
            tmp = tmp.next;
        }
        return values;
    }

    public List getEntries() {
        List entries = new List();
        List pair;
        Node tmp = mapList.head;
        while (tmp != null) {
            pair = new List();
            pair.add(((MapPair) tmp.data).key);
            pair.add(((MapPair) tmp.data).value);
            entries.add(pair);
            tmp = tmp.next;
        }
        return entries;
    }

    public int size() { return this.size; }

    public boolean isEmpty() {return this.size == 0;}
}