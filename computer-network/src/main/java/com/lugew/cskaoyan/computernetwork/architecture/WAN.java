package com.lugew.cskaoyan.computernetwork.architecture;

/**
 * 广域网，范围为几十千米到几千千米
 * Wide Area Network
 */
public class WAN extends ScopeNetwork {
    public WAN() {
        super(Scope.builder()
                .min(50001L)
                .max(999999L)
                .build());

    }
}
