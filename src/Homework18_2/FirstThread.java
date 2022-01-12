package Homework18_2;

public class FirstThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Java ");
        }
        System.out.print("\n");
    }
}