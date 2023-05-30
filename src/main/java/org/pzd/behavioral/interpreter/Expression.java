package org.pzd.behavioral.interpreter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public interface Expression {
    public boolean interpret(String context);
}
