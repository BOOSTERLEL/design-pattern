package org.pzd.behavioral.visitor;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class Computer implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
