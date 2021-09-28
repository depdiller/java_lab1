package map;

public class Map<T, V> {

    private MapEl[] mapList;
    private int size;

    public Map() {
        this.mapList = new MapEl[8];
        this.size = 0;
    }

    public void put(T key, V value) {
        MapEl newEl = new MapEl(key, value);
        if (size < this.mapList.length) {
            this.mapList[size] = newEl;
            ++this.size;
        }
        else {
            this.mapList = copyAndResize(this.mapList, this.size + 1);
            this.mapList[this.size++] = newEl;
        }
    }

    private static MapEl[] copyAndResize(MapEl[] list, int newLength) {
        MapEl[] resizedL = new MapEl[newLength];
        for (int i = 0; i < list.length; ++i) {
            resizedL[i] = list[i];
        }
        return resizedL;
    }

    public MapEl get(T key) {
        for (int i = 0; i < this.mapList.length; ++i) {
            if (this.mapList[i].key == key) {
                MapEl el = new MapEl(key, this.mapList[i].key);
                return el;
            }
        }
        return null;
    }

    public MapEl get(T key, MapEl bydefault) {
        for (int i = 0; i < this.mapList.length; ++i) {
            if (this.mapList[i].key == key) {
                MapEl el = new MapEl(key, this.mapList[i].key);
                return el;
            }
        }
        return bydefault;
    }

    public MapEl remove(T key) {

    }

    public boolean keyContains(T key) {
        for (int i = 0; i < this.size; ++i) {
            if (this.mapList[i].key == key) {
                return true;
            }
        }
        return false;
    }

    public List getKeys() {

    }

    public List getValues() {

    }

    public List getEntries() {

    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0)
            return true;
        return false;
    }
}
//2. Реализовать словарь (map)
//        Операции
//        - Положить по ключу значение:          public void put(Object key, Object value);
//        - Получить по ключу:                   public Object get(Object key);
//        - Получить по ключу,                   public Object get(Object key, Object bydefault);
//        если значение null, тогда надо
//        вернуть значение по умолчанию,
//        которое задается вторым параметром.
//        Значение по умолчанию необходимо
//        сохранить.
//        - Удалить по ключу, возвращает текущее public Object remove(Object key);
//        значение
//        - Проверить наличие ключа:             public boolean keyContains(Object key);
//        - Получить список ключей:              public List getKeys();
//        - Получить список значений:            public List getValues();
//        - Получить список пар: ключ, значение: public List getEntries();
//        - Размер словаря:                      public int size();
//        - Пустой или нет:                      public boolean isEmpty();