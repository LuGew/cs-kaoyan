package com.lugew.cskaoyan.computernetwork.datalinklayer;

/**
 * CSMA/CA协议，载波侦听多路访问协议/碰撞避免
 * 适用于无线局域网
 * Carrier Sense Multiple Access with Collision Avoidance
 * 广播其他节点，阻止其他节点发送数据
 * 预约信道
 * ACK帧
 * RTS/CTS帧：主要解决隐蔽站问题
 * 最小帧长度=总传播时延*数据传输速率*2
 * 冲突->2进制指数退避算法
 */
public interface CSMACA extends CSMA {

}
