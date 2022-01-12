package Homework18_2;

public class Homework18_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(new FirstThread());
        Thread second = new Thread(new SecondThread());
        Thread main = new Thread();
        first.start();
        second.start();
        main.start();
        for (int i = 0; i < 3; i++) {
            System.out.print("Java ");
        }
        System.out.print("\n");
        first.join();
        second.join();
        first.interrupt();
        second.interrupt();
        main.interrupt();
        if(first.isInterrupted() == true) {
            System.out.println("Поток first завершил работу");
        }
        if(second.isInterrupted() == true) {
            System.out.println("Поток second завершил работу");
        }
        if(main.isInterrupted() == true) {
            System.out.println("Поток main завершил работу");
        }
    }
}