package ru.example.alexander_nozdryuhin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private List<Music> musics=new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(Music music,String name, int volume) {
        musics.add(music);
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music... music) {
        musics.addAll(Arrays.asList(music));
    }
    public void playMusic(){
        System.out.println(name+" player with "+volume+"volume");
        for(Music music:musics) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public MusicPlayer() {
    }

    public void setMusic(Music... music) {
        musics.addAll(Arrays.asList(music));
    }
}
