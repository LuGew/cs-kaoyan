package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author LuGew
 * @since 2020/7/20
 */
class BinaryConverterSpecification {
    private BinaryConverter converter;

    @BeforeEach
    void setUp() {
        converter = new BinaryConverter();
    }

    @Test
    void whenOctal7Then111() {
        assertThat(converter.convert(Numeration.OCTAL, "7"))
                .isEqualTo("111");
    }

    @Test
    void whenOctal7dot7Then111() {
        assertThat(converter.convert(Numeration.OCTAL, "7.7"))
                .isEqualTo("111.111");
    }

    @Test
    void whenOctal70dot07Then111000dot000111() {
        assertThat(converter.convert(Numeration.OCTAL, "70.07"))
                .isEqualTo("111000.000111");
    }

    @Test
    void whenOctal70dot06Then111000dot000111() {
        assertThat(converter.convert(Numeration.OCTAL, "70.06"))
                .isEqualTo("111000.00011");
    }

    @Test
    void whenOctal10Then1000() {
        assertThat(converter.convert(Numeration.OCTAL, "10"))
                .isEqualTo("1000");
    }

    @Test
    void whenOctal0110Then1001000() {
        assertThat(converter.convert(Numeration.OCTAL, "0110"))
                .isEqualTo("1001000");
    }

    @Test
    void whenOctal0Then0() {
        assertThat(converter.convert(Numeration.OCTAL, "0"))
                .isEqualTo("0");
    }

    /*binary*/
    @Test
    void whenBinary0Then0() {
        assertThat(converter.convert(Numeration.BINARY, "0"))
                .isEqualTo("0");
    }

    @Test
    void whenBinary0dot0Then0dot0() {
        assertThat(converter.convert(Numeration.BINARY, "0.0"))
                .isEqualTo("0.0");
    }

    @Test
    void whenBinary1dot1Then1dot1() {
        assertThat(converter.convert(Numeration.BINARY, "1.1"))
                .isEqualTo("1.1");
    }

    @Test
    void whenBinary10Then10() {
        assertThat(converter.convert(Numeration.BINARY, "10"))
                .isEqualTo("10");
    }

    @Test
    void whenBinary10dot01Then10dot01() {
        assertThat(converter.convert(Numeration.BINARY, "10.01"))
                .isEqualTo("10.01");
    }

    @Test
    void whenBinary000100Then100() {
        assertThat(converter.convert(Numeration.BINARY, "000100"))
                .isEqualTo("100");
    }

    /**
     * decimal
     */
    @Test
    void whenDecimal123dot6875Then10dot1111011dot1011() {
        assertThat(converter.convert(Numeration.DECIMAL, "123.6875"))
                .isEqualTo("1111011.1011");

    }

    /**
     * hex
     */
    @Test
    void whenHex10Then10000() {
        assertThat(converter.convert(Numeration.HEX, "10"))
                .isEqualTo("10000");
    }

    @Test
    void whenHex1AThen10000() {
        assertThat(converter.convert(Numeration.HEX, "1A"))
                .isEqualTo("11010");
    }

    @Test
    void whenHex1AdotA1Then11010dot10101() {
        assertThat(converter.convert(Numeration.HEX, "1A.A1"))
                .isEqualTo("11010.10100001");
    }

    @Test
    void whenHexddaAThen1110111010101010() {
        assertThat(converter.convert(Numeration.HEX, "ddaA"))
                .isEqualTo("1101110110101010");
    }

    @Test
    void whenHexddaAdotAADDThen1110111010101010dot1010101011011101() {
        assertThat(converter.convert(Numeration.HEX, "ddaA.aadd"))
                .isEqualTo("1101110110101010.1010101011011101");
    }
}