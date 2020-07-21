package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author LuGew
 * @since 2020/7/20
 */
class DecimalConverterSpecification {
    private DecimalConverter converter;

    @BeforeEach
    void setUp() {
        converter = new DecimalConverter();
    }

    @Test
    void whenOctal10Then8() {
        assertThat(converter.convert(Numeration.OCTAL, "10"))
                .isEqualTo("8");
    }

    @Test
    void whenOctal10dot01Then8() {
        assertThat(converter.convert(Numeration.OCTAL, "10.01"))
                .isEqualTo("8.015625");
    }

    @Test
    void whenBinary10Then2() {
        assertThat(converter.convert(Numeration.BINARY, "10"))
                .isEqualTo("2");
    }

    @Test
    void whenBinary10dot01Then2dot25() {
        assertThat(converter.convert(Numeration.BINARY, "10.01"))
                .isEqualTo("2.25");
    }

    @Test
    void whenHex10Then16() {
        assertThat(converter.convert(Numeration.HEX, "10"))
                .isEqualTo("16");
    }

    @Test
    void whenHex10dot01Then16dot00390625() {
        assertThat(converter.convert(Numeration.HEX, "10.01"))
                .isEqualTo("16.00390625");
    }
}