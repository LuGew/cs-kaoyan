package com.lugew.cskaoyan.computernetwork.architecture;

/**
 * 城域网，范围为5~50km
 * Metropolitan Area Network
 */
public class MAN extends ScopeNetwork {
    public MAN() {
        super(Scope.builder()
                .min(5000L)
                .max(500000L)
                .build());
    }
}
