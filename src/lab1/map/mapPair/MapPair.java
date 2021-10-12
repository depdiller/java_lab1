package lab1.map.mapPair;

public class MapPair {
    public Object key;
    public Object value;

    public MapPair() {
        key = null;
        value = null;
    }

    public MapPair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return this.key;
    }
}
