package Homework1_4;

public class Homework1_4 {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < 5; i++) {
            Computer computer = new Computer(i);
            computers[i] = computer;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(computers[i].getId());
        }
    }
}

