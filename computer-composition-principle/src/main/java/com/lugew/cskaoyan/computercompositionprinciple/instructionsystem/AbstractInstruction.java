package com.lugew.cskaoyan.computercompositionprinciple.instructionsystem;

/**
 * 抽象指令
 *
 * @author LuGew
 * @since 2020/9/19
 */

public class AbstractInstruction implements Instruction {
    protected String operationCode;
    protected int operationCodeLength;

    protected String addressCode;
    protected int addressCodeLength;

    protected int length;

}
