package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LuGew
 * @since 2020/7/20
 */
public abstract class AbstractConverter implements Converter {
    protected final String ZERO = "0";
    protected final Numeration NUMERATION = Numeration.BINARY;
    protected final int PRECISION = 4;

    protected final Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>() {
        {
            put('0', 0);
            put('1', 1);
            put('2', 2);
            put('3', 3);
            put('4', 4);
            put('5', 5);
            put('6', 6);
            put('7', 7);
            put('8', 8);
            put('9', 9);
            put('a', 10);
            put('b', 11);
            put('c', 12);
            put('d', 13);
            put('e', 14);
            put('f', 15);
            put('A', 10);
            put('B', 11);
            put('C', 12);
            put('D', 13);
            put('E', 14);
            put('F', 15);
        }
    };

    @Override
    public String convert(Numeration numeration, String input) {
        throw new RuntimeException("convert must be implemented");
    }

    public String takeTheRemainderByDividingTheBase(Integer input) {
        StringBuilder result = new StringBuilder();
        Integer radix = NUMERATION.getRadix();
        while (input != 0) {
            result.insert(0, input % radix);
            input /= radix;
        }
        return result.toString();
    }

    public String roundingByRadix(Integer input) {
        StringBuilder result = new StringBuilder();
        String inputString = String.valueOf(input);
        int b = (int) Math.pow(10, inputString.length());
        int tempInput = input;
        int target = 1000000000;
        int tempInteger = 0;
        int radix = NUMERATION.getRadix();
        while (true) {
            tempInput *= radix;
            tempInteger = tempInput / b;
            if (intEquals(tempInput, target, PRECISION)) {
                result.append(tempInteger);
                break;
            } else {
                result.append(tempInteger);
            }
            tempInput = tempInput - tempInteger * b;

        }
        return result.toString();
    }

    public boolean intEquals(int d1, int d2, int precision) {
        String d1String = String.valueOf(d1);
        String d2String = String.valueOf(d2);
        int length = Math.min(d1String.length(), d2String.length());
        for (int i = 0; i < length && i < precision; i++) {
            if (d1String.charAt(i) != d2String.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
