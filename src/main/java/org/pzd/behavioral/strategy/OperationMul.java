package org.pzd.behavioral.strategy;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class OperationMul implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
