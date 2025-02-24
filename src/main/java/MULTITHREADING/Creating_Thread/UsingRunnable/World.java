package MULTITHREADING.Creating_Thread.UsingRunnable;

public class World implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
