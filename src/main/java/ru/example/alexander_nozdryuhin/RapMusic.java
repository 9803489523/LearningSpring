package ru.example.alexander_nozdryuhin;

public class RapMusic implements Music{
    private RapMusic(){};

    public static RapMusic getRapMusic(){
        return new RapMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Eminem - Lose yourself";
    }
}
