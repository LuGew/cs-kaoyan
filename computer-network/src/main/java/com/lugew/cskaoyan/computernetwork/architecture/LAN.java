package com.lugew.cskaoyan.computernetwork.architecture;

import com.lugew.cskaoyan.computernetwork.datalinklayer.MAC;
import com.lugew.cskaoyan.computernetwork.physicallayer.TransmissionMedium;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 局域网，范围为几十米到几千米
 * Local Area Network
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class LAN extends ScopeNetwork {
    private TransmissionMedium transmissionMedium;
    private Topology physicalTopology;
    private Topology logicalTopology;
    private MAC mac;

    public LAN() {
        super(Scope.builder()
                .min(50L)
                .max(4999L)
                .build());
    }


}
