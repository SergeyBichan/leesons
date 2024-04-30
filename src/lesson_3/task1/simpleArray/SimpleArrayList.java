package lesson_3.task1.simpleArray;

import java.util.Collection;

public interface SimpleArrayList<E> extends Iterable<E>{
    boolean add(E e);
    void delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
    boolean addAll(E[] e);
}
