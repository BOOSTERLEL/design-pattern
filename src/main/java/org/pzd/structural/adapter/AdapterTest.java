package org.pzd.structural.adapter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/25
 * @apiNote
 */
public class AdapterTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4", "alone.mp4");
    }
}
