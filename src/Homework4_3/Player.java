package Homework4_3;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Playing was started");
    }

    @Override
    public void record() {
        System.out.println("Record was started");
    }

    @Override
    public void pause() {
        System.out.println("Paused");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}