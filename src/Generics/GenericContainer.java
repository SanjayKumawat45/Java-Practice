package Generics;

import Generics.Interface.Container;

public class GenericContainer<T> implements Container<T> {

    private T item;
    @Override
    public void add(T item) {

    }

    @Override
    public T get() {
        return item;
    }
}
