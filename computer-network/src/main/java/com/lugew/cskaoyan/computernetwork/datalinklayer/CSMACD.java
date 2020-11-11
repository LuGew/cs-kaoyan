package com.lugew.cskaoyan.computernetwork.datalinklayer;

/**
 * CSMA/CD协议，载波侦听多路访问协议/碰撞检测
 * 适用于总线形/半双工网络
 * 已成功应用于有线局域网
 * Carrier Sense Multiple Access with Collision Detection
 * <p>
 * 先听后发，边听边发
 * 冲突停发，随机重发
 * 2t争用期
 * 最小帧长度=总传播时延*数据传输速率*2
 * 冲突->2进制指数退避算法
 */
public interface CSMACD extends CSMA {

}
