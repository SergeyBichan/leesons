package lesson_3.task1.simpleArray;

import java.util.Iterator;

public class MySimpleArrayIterator<E> implements Iterator<E> {

    private int index = 0;
    E[] values;

    public MySimpleArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
