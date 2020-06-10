package com.lugew.study.datastructurealgorithm.starter.datastructure;

import java.util.List;

/**
 * 数据结构
 *
 * @author LuGew
 * @since 2020/6/10
 */
public interface DataStructure {

    LogicalStructure getLogicalStructure();

    StorageStructure getStorageStructure();

    List<Operation> getOperations();

}
