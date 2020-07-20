package com.lugew.cskaoyan.computercompositionprinciple.datarepresentation;

/**
 * @author LuGew
 * @since 2020/7/20
 */
public enum Numeration {
    BINARY(2),
    OCTAL(8),
    DECIMAL(10),
    HEX(16),
    ;
    private Integer radix;


    Numeration(Integer value) {
        this.radix = value;

    }

    public Integer getRadix() {
        return radix;
    }

    public void setRadix(Integer radix) {
        this.radix = radix;
    }
}
