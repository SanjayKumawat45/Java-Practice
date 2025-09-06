package Generics;

import Generics.Interface.Container;

public class StringContainer implements Container<String> {

    private String item;
    @Override
    public void add(String item) {

    }

    @Override
    public String get() {
        return "";
    }
}
