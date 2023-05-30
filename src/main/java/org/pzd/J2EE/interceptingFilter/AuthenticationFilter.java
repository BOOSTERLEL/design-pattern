package org.pzd.J2EE.interceptingFilter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
