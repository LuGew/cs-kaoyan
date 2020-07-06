package com.lugew.study.list;

/**
 * @author LuGew
 * @since 2020/6/22
 */
public class ListPractice {


    public SingleList.Node commonSuffix(SingleList<Character> str1, SingleList<Character> str2) {
        int[] str1Map = new int[256];
        SingleList.Node current = str1.header.next;
        while (current != null) {
            str1Map[(int) current.data] = 1;
        }

        SingleList.Node str2Current = str2.header.next;
        SingleList.Node p = null;
        int count = 0;
        while (str2Current != null) {
            if (str1Map[(int) str2Current.data] == 1) {
                count++;
                if (count == 1) {
                    p = str2Current;
                }
            } else {
                count = 0;
            }
            str2Current = str2Current.next;
        }
        if (count == 0) {
            return null;
        } else {
            return p;
        }
    }

    public class SingleList<T extends Comparable<T>> {
        private Node<T> header;

        public SingleList() {
            header = new Node<>();
        }

        private class Node<T> {
            T data;
            Node<T> next;
        }
    }
}
