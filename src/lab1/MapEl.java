package map;

public class MapEl<T, V> {
    public T key;
    public V value;

    public MapEl(T k, V v) {
        this.key = k;
        this.value = v;
    }

    public MapEl() {
        this.key = null;
        this.value = null;
    }

}

