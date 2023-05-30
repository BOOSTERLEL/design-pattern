package org.pzd.structural.adapter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
