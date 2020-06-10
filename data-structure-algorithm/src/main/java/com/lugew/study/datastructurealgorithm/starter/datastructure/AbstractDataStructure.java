package com.lugew.study.datastructurealgorithm.starter.datastructure;

import com.lugew.study.datastructurealgorithm.starter.datastructure.DataStructure;
import com.lugew.study.datastructurealgorithm.starter.datastructure.LogicalStructure;
import com.lugew.study.datastructurealgorithm.starter.datastructure.Operation;
import com.lugew.study.datastructurealgorithm.starter.datastructure.StorageStructure;

import java.util.List;

/**
 * @author LuGew
 * @since 2020/6/10
 */
public class AbstractDataStructure implements DataStructure {
    private LogicalStructure logicalStructure;
    private StorageStructure storageStructure;
    private List<Operation> operations;

    @Override
    public LogicalStructure getLogicalStructure() {
        return logicalStructure;
    }

    public void setLogicalStructure(LogicalStructure logicalStructure) {
        this.logicalStructure = logicalStructure;
    }

    @Override
    public StorageStructure getStorageStructure() {
        return storageStructure;
    }

    public void setStorageStructure(StorageStructure storageStructure) {
        this.storageStructure = storageStructure;
    }

    @Override
    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
