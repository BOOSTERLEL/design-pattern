package org.pzd.structural.adapter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
