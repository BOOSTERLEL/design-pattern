package org.pzd.behavioral.visitor;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class VisitorTest {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerDisplayVisitor());
    }
}
