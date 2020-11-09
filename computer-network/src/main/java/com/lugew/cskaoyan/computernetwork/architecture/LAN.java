package com.lugew.cskaoyan.computernetwork.architecture;

/**
 * 局域网，范围为几十米到几千米
 * Local Area Network
 */
public class LAN extends ScopeNetwork {
    public LAN() {
        super(Scope.builder()
                .min(50L)
                .max(4999L)
                .build());
    }
}
