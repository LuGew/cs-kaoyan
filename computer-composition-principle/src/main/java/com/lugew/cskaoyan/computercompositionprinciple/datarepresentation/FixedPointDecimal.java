package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

/**
 * 定点小数
 *
 * @author LuGew
 * @since 2020/7/21
 */
public class FixedPointDecimal extends AbstractFixedPointNumber {
    @Override
    public String trueValue(String input) {
        Character character = input.charAt(0);
        if ('0' == character) {
            return String.valueOf(1 - Math.pow(2, -7));

        } else {
            return String.valueOf(Math.pow(2, -7) - 1);
        }
    }
}
