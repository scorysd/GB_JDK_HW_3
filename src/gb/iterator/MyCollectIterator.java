package gb.iterator;

import java.util.Iterator;

public class MyCollectIterator<T> implements Iterator<T> {

    private final MyCollection<T> collection;
    private int index = 0;

    public MyCollectIterator(MyCollection<T> collection) {this.collection = collection;
    }


    @Override
    public boolean hasNext() {
        return index < collection.getSize();
    }

    @Override
    public T next() {
        T item = collection.getByIndex(index);
        index++;
        return item;
    }
}
