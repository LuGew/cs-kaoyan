package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

/**
 * 定点整数
 *
 * @author LuGew
 * @since 2020/7/21
 */
public class FixedPointInteger implements FixedPointNumber {
    @Override
    public String trueValue(String input) {
        Character character = input.charAt(0);
        if ('0' == character) {
            return String.valueOf((int) Math.pow(2, 7) - 1);

        } else {
            return String.valueOf(1 - (int) Math.pow(2, 7));
        }
    }
}
