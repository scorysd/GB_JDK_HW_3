package gb.iterator;

import java.util.Iterator;

public class MyCollection<T> implements Iterable<T>{
    private T[] array;
    private int index = 0;
    private int size;

    public MyCollection(T[] array) {
        this.array = array;
        this.size = array.length;
    }
    public void addItem(T item){
        if (index < size){
            array[index] = item;
            index++;
        }
        else throw new RuntimeException("Array is full!");
    }
    public void delItem(int index){
        array[index]=null;
    }
    public void printCollection(){
        for (T t:array) {
            System.out.printf(t + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
    public T getByIndex(int index){
        return array[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new MyCollectIterator<>(this);
    }
}
