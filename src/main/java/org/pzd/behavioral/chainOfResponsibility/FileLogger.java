package org.pzd.behavioral.chainOfResponsibility;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
