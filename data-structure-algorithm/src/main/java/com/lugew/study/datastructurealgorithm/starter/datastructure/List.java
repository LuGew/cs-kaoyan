package com.lugew.study.datastructurealgorithm.starter.datastructure;

/**
 * 线性表
 *
 * @author LuGew
 * @since 2020/6/10
 */
public interface List<T> extends LinearStructure {

    void init();

    int length();

    int locate(T element);

    T get(int index);

    boolean insert(int index, T element);

    T delete(int index);

    String print();

    boolean isEmpty();

}
