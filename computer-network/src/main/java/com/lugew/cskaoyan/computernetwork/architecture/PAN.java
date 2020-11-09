package com.lugew.cskaoyan.computernetwork.architecture;

/**
 * 个人区域网，范围为10米左右
 * Personal Area Network
 */
public class PAN extends ScopeNetwork {
    public PAN() {
        super(Scope.builder()
                .min(9L)
                .max(49L)
                .build());
    }
}
