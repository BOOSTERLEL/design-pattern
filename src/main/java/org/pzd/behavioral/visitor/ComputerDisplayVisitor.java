package org.pzd.behavioral.visitor;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class ComputerDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Display keyboard");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Display computer");
    }
}
