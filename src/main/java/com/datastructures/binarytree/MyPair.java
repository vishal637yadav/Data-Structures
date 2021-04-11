package com.datastructures.binarytree;

public class MyPair<E,Y> {
    E key;
    Y value;

    @Override
    public String toString() {
        return "MyPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public MyPair(E key, Y value) {
        this.key = key;
        this.value = value;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    public Y getValue() {
        return value;
    }

    public void setValue(Y value) {
        this.value = value;
    }
}
