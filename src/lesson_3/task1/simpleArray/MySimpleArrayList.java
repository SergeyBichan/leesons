package lesson_3.task1.simpleArray;

import java.util.Iterator;

public class MySimpleArrayList<E> implements SimpleArrayList<E>{

    private E[] values;

    public MySimpleArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] tempArray = values;
            values = (E[]) new Object[tempArray.length + 1];
            System.arraycopy(tempArray, 0, values, 0, tempArray.length);
            values[values.length-1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] tempArray = values;
            values = (E[]) new Object[tempArray.length - 1];
            System.arraycopy(tempArray, 0, values, 0, index);
            int elementsAfterIndex = tempArray.length - (index + 1);
            System.arraycopy(tempArray, index + 1, values, index, elementsAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public E get(int index) {
        if (index < 0 || index > values.length) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива!");
        }
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public boolean addAll(E[] e) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MySimpleArrayIterator<E>(values);
    }
}
