package Homework4_2;

import java.util.Scanner;

public class Homework4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input file name with format: ");
        String name = input.next();
        AbstractHandler file = null;
        if (name.endsWith(".doc")) {
            file = new DOCHandler(name);
        } else if (name.endsWith(".txt")) {
            file = new TXTHandler(name);
        } else if (name.endsWith(".xml")) {
            file = new XMLHandler(name);
        } else {
            System.out.println("error");
        }
        System.out.print("Input what you want to do with file (open, create, change, save): ");
        String choice = input.next();
        switch (choice) {
            case ("open"):
                file.open();
                break;
            case ("create"):
                file.create();
                break;
            case ("change"):
                file.change();
                break;
            case ("save"):
                file.save();
                break;
            default:
                System.out.println("error");
        }
    }
}