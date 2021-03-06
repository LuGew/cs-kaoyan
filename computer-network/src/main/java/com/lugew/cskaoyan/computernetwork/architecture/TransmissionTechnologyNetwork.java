package com.lugew.cskaoyan.computernetwork.architecture;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 传输技术分类
 */

@NoArgsConstructor
@AllArgsConstructor
public abstract class TransmissionTechnologyNetwork extends AbstractComputerNetwork {
    protected boolean groupingStoreAndForward;
    protected boolean routingMechanism;

}
