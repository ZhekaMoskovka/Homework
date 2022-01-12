package Homework18_3;

public class PriorityThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println(getName());
    }
}