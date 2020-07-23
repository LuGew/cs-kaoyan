package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author LuGew
 * @since 2020/7/21
 */
class FixedPointDecimalSpecification {

    private FixedPointNumber fixedPointNumber;

    @BeforeEach
    void setUp() {
        fixedPointNumber = new FixedPointDecimal();
    }

    @Test
    void when01111111ThenMax() {
        assertThat(fixedPointNumber.trueValue("01111111"))
                .isEqualTo(String.valueOf(1 - Math.pow(2, -7)));
    }

    @Test
    void when11111111ThenMin() {
        assertThat(fixedPointNumber.trueValue("11111111"))
                .isEqualTo(String.valueOf(Math.pow(2, -7) - 1));
    }
}