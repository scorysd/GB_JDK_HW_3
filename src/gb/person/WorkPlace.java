package gb.person;

import gb.iterator.MyCollectIterator;
import gb.iterator.MyCollection;

import java.util.Iterator;

public class WorkPlace <T extends Person> implements Iterable<T>{
    private T[] persons;

    public WorkPlace(T[] persons) {
        this.persons = persons;
    }
    public void workingAll(){
        for (T item: persons) {
            item.doWork();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyCollectIterator<T>();
    }

    class MyCollectIterator<T extends Person> implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < persons.length;
        }

        @Override
        public T next() {
            T item = (T) persons[index];
            index++;
            return item;
        }
    }
}
