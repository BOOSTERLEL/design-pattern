package org.pzd.behavioral.visitor;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
