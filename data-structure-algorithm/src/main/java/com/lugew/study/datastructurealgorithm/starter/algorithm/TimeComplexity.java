package com.lugew.study.datastructurealgorithm.starter.algorithm;

/**
 * @author LuGew
 * @since 2020/6/10
 */
public enum TimeComplexity {
    N("O(n)"),
    N2("O(n^2)"),
    N3("O(n^3)"),
    LOG_N("O(log_2(n)"),
    LN_N("O(ln(n))"),
    NxLOG_N("O(nlog_2(n)"),
    INDEX("O(2^n)"),
    CONSTANT("O(1)"),
    FACTORIAL("O(n!)"),
    NxN("O(n!)"),
    ;

    private String value;

    TimeComplexity(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
