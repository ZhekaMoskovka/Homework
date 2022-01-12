package Homework18_3;

public class Homework18_3 {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new PriorityThread());
        Thread secondThread = new Thread(new PriorityThread());
        Thread thirdThread = new Thread(new PriorityThread());
        firstThread.setName("firstThread");
        secondThread.setName("secondThread");
        thirdThread.setName("thirdThread");
        firstThread.setPriority(Thread.MIN_PRIORITY);
        secondThread.setPriority(Thread.MAX_PRIORITY);
        thirdThread.setPriority(Thread.NORM_PRIORITY);
        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}