package com.lugew.cskaoyan.computernetwork.physicallayer;

/**
 * 传输介质
 */
public enum TransmissionMedium {
    SHIELDED_TWISTED_PAIR_COPPER_WIRE("屏蔽双绞线"),
    UNSHIELDED_TWISTED_PAIR_COPPER_WIRE("无屏蔽双绞线"),
    COAXIAL_CABLE("同轴电缆"),
    FIBER_OPTICS("光纤"),
    TERRESTRIAL_RADIO_CHANNELS("无线电波"),
    SATELLITE_RADIO_CHANNELS("卫星广播");

    TransmissionMedium(String name) {

    }
}
