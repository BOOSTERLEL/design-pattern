package org.pzd.behavioral.state;

import lombok.Data;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
@Data
public class Context {
    private State state;

    public Context() {
        state = null;
    }
}
