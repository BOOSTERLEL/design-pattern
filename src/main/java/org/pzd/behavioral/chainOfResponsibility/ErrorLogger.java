package org.pzd.behavioral.chainOfResponsibility;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
