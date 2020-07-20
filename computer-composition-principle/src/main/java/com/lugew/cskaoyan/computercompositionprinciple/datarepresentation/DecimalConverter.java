package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

/**
 * 任意进制转换十进制
 *
 * @author LuGew
 * @since 2020/7/20
 */
public class DecimalConverter extends AbstractConverter {
    @Override
    public String convert(Numeration numeration, String input) {
        double result = 0;
        String[] inputArray = input.split("\\.");
        int leftLength = inputArray[0].length();
        for (int i = 0; i < leftLength; i++) {
            result += (characterIntegerMap.get(inputArray[0].charAt(i)) * Math.pow(numeration.getRadix(), leftLength - i - 1));

        }
        if (inputArray.length > 1) {
            int rightLength = inputArray[1].length();
            for (int i = 0; i < rightLength; i++) {
                result += (characterIntegerMap.get(inputArray[1].charAt(i)) * Math.pow(numeration.getRadix(), -i - 1));
            }
        }
        int temp = (int) result;
        if (temp == result) {
            return String.valueOf(temp);
        } else {
            return String.valueOf(result);
        }
    }


}
