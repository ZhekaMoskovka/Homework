package Homework4_3;

public class Player implements Playable, Recodable {
    public String previousCommand = "null";
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

    public void choice (String command) {
        if (command.equals("record") && !previousCommand.equals("record") && !previousCommand.equals("play")) {
            record();
        } else if (command.equals("play") && !previousCommand.equals("record") && !previousCommand.equals("play")) {
            play();
        } else if (command.equals("pause")) {
            pause();
        } else if (command.equals("stop")) {
            stop();
        } else {
            System.out.println("error");
        }
        previousCommand = command;
    }
}