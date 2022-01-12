package Homework18_2;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}