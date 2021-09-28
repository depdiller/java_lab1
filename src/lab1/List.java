package lab1;

public class List {
    private int[] list;
    private int size;

    public List() {
        this.size = 0;
        this.list = new int[8]; // any power of two
    }

    public void add(int el) {
        if (size < this.list.length - 1) {
            this.list[size] = el;
            ++this.size;
        }
        else {
            int copy[] = copyAndResize(this.list, this.size + 1);
            copy[this.size++] = el;
            this.list = copy;
        }
    }

    public void add(int index, int el) {
        int[] copy = copyByIndex(this.list, index, el, this.size + 1);
        ++this.size;
        this.list = copy;
    }

    public void remove(int index) {
        if(index > 0 && index < this.list.length)
        {
            int[] copy = copyForRemove(this.list, index, this.size - 1);
            this.list = copy;
        }
        --this.size;
    }
    private static int[] copyForRemove(int[] list, int index, int newLength)
    {
        int[] resizedL = new int[newLength];
        int i = 0;
        for (i = 0; i < index; ++i)
            resizedL[i] = list[i];
        resizedL[index] = list[i+1];
        i += 2;
        for (; i < list.length; ++i)
            resizedL[i-1] = list[i];
        return resizedL;
    }

    private static int[] copyByIndex(int[] list, int index, int el, int newLength) {
        int[] resizedL = new int[newLength];
        int i = 0;
        for (i = 0; i < index; ++i)
            resizedL[i] = list[i];
        resizedL[index] = el;
        for (; i < list.length; ++i)
            resizedL[i + 1] = list[i];
        return resizedL;
    }

    private static int[] copyAndResize(int[] list, int newLength) {
        int[] resizedL = new int[newLength];
        for (int i : list) {
            resizedL[i] = list[i];
        }
        return resizedL;
    }

    public List get(int index){
        List n = new List();
        if (index < this.size){
            n.add(this.list[index]);
        }
        return n;
    }

    public int indexOf(int value) {
        for (int i = 0; i < this.size; ++i) {
            if (this.list[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int value) {
        for (int i = 0; i < this.size; ++i) {
            if (this.list[i] == value) {
                return true;
            }
        }
        return false;
    }

    public List get(int index, int value) {
        List n = new List();
        if (index < this.size && this.list[index] == value) {
            n.add(value);
        }
        return n;
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