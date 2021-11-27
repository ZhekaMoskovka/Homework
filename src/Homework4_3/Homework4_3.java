package Homework4_3;

import java.util.Scanner;

public class Homework4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player = new Player();
        String command;
        do {
            System.out.print("Input what you want to do(record, play, pause, stop): ");
            command = input.next();
            player.choice(command);
        } while (!command.equals("stop"));
    }
}