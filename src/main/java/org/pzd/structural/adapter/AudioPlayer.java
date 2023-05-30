package org.pzd.structural.adapter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
