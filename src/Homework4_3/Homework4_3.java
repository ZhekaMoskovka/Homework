package Homework4_3;

import java.util.Scanner;

public class Homework4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = null;
        Player player = new Player();
        String previousCommand = "null";
        do {
            System.out.print("Input what you want to do(record, play, pause, stop): ");
            command = input.next();
            if (command.equals("record") && !previousCommand.equals("record") && !previousCommand.equals("play")) {
                player.record();
            } else if (command.equals("play") && !previousCommand.equals("record") && !previousCommand.equals("play")) {
                player.play();
            } else if (command.equals("pause")) {
                player.pause();
            } else if (command.equals("stop")) {
                player.stop();
            } else {
                System.out.println("error");
            }
            previousCommand = command;
        } while (!command.equals("stop"));
    }
}