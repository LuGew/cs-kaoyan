package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

/**
 * 任意进制转换二进制
 *
 * @author LuGew
 * @since 2020/7/20
 */
public class BinaryConverter extends AbstractConverter {
    public BinaryConverter() {
        numeration = Numeration.BINARY;
    }

    @Override
    public String convert(Numeration numeration, String input) {
        StringBuilder result = new StringBuilder();
        String[] inputArray = input.split("\\.");
        if (numeration.equals(Numeration.DECIMAL)) {
            result.append(takeTheRemainderByDividingTheBase(numeration, Integer.valueOf(inputArray[0])));
            removeZero(result);
            StringBuilder rightResult = new StringBuilder(".");
            rightResult.append(roundingByRadix(Integer.valueOf(inputArray[1])));
            removeEndZero(rightResult);
            result.append(rightResult);
            return result.toString();
        }

        for (int i = 0, length = inputArray[0].length(); i < length; i++) {
            int value = characterIntegerMap.get(inputArray[0].charAt(i));
            result.append(takeTheRemainderByDividingTheBase(numeration, value));
        }
        removeZero(result);
        if (inputArray.length > 1) {
            StringBuilder rightResult = new StringBuilder(".");
            for (int i = 0, length = inputArray[1].length(); i < length; i++) {
                int value = characterIntegerMap.get(inputArray[1].charAt(i));
                rightResult.append(takeTheRemainderByDividingTheBase(numeration, value));
            }
            removeEndZero(rightResult);
            result.append(rightResult);
        }

        return result.toString();
    }

    public StringBuilder removeZero(StringBuilder input) {
        while (input.length() > 1 && 0 == input.indexOf(ZERO)) {
            input.replace(0, 1, "");
        }
        return input;
    }

    public StringBuilder removeEndZero(StringBuilder input) {
        while (input.length() > 2 && input.length() - 1 == input.lastIndexOf(ZERO)) {
            input.replace(input.length() - 1, input.length(), "");
        }
        return input;
    }

    public String takeTheRemainderByDividingTheBase(Numeration numeration, Integer input) {
        StringBuilder result = new StringBuilder(super.takeTheRemainderByDividingTheBase(input));
        switch (numeration) {
            case OCTAL:
                zeroPadding(result, 3);
                break;
            case HEX:
                zeroPadding(result, 4);
                break;
            case BINARY:
                zeroPadding(result, 1);
                break;
            default:
        }
        return result.toString();

    }

    public StringBuilder zeroPadding(StringBuilder input, int size) {
        while (input.length() < size) {
            input.insert(0, ZERO);
        }
        return input;
    }
}
