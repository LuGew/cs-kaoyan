package com.lugew.study.list;

import com.lugew.study.datastructurealgorithm.starter.datastructure.List;

/**
 * @author LuGew
 * @since 2020/6/10
 */
public abstract class AbstractList<T> implements List<T> {
    private int size;

    @Override
    public void init() {

    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public int locate(T element) {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public boolean insert(int index, T element) {
        return false;
    }

    @Override
    public T delete(int index) {
        return null;
    }

    @Override
    public String print() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }
}
