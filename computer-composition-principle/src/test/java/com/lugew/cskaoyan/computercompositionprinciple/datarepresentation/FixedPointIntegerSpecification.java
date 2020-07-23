package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author LuGew
 * @since 2020/7/21
 */
class FixedPointIntegerSpecification {

    private FixedPointNumber fixedPointNumber;

    @BeforeEach
    void setUp() {
        fixedPointNumber = new FixedPointInteger();
    }

    @Test
    void when0111111Then127() {
        assertThat(fixedPointNumber.trueValue("01111111"))
                .isEqualTo("127");
    }

    @Test
    void when1111111ThenNegative127() {
        assertThat(fixedPointNumber.trueValue("11111111"))
                .isEqualTo("-127");
    }
}