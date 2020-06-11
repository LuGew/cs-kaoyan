package com.lugew.study.list;

import java.util.Arrays;

/**
 * 顺序表
 *
 * @author LuGew
 * @since 2020/6/10
 */
public class ArrayList<T> extends AbstractList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    @Override
    public int locate(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public boolean insert(int index, T element) {
        if (length() - index >= 0) {
            System.arraycopy(elements, index, elements, index + 1, length() - index);
        }
        elements[index] = element;
        return true;
    }

    @Override
    public T delete(int index) {
        T element = elements[index];
        if (length() - index >= 0) {
            System.arraycopy(elements, index + 1, elements, index, length() - index);
        }
        return element;
    }

    @Override
    public String print() {
        return Arrays.toString(elements);
    }
}
