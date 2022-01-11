package ru.example.alexander_nozdryuhin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

public class TestSpring {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
       /* MusicPlayer musicPlayer1=context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer musicPlayer2=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer1==musicPlayer2);
        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getName()+" "+musicPlayer1.getVolume());*/
        File file=new File("Аннотации.txt");
        file.createNewFile();
        RapMusic rapMusic=context.getBean("rapBean",RapMusic.class);
        System.out.println(rapMusic.getSong());

        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
