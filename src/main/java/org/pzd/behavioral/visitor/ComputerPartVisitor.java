package org.pzd.behavioral.visitor;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public interface ComputerPartVisitor {
    public void visit(Keyboard keyboard);

    public void visit(Computer computer);
}
