package com.lugew.cskaoyan.computernetwork.architecture;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ScopeNetwork extends AbstractComputerNetwork {
    protected Scope scope;

    @Data
    @Builder
    protected static class Scope {
        Long min;
        Long max;
    }

}
