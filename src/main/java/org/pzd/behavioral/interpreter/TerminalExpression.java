package org.pzd.behavioral.interpreter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
