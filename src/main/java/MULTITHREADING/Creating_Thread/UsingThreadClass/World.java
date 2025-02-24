package MULTITHREADING.Creating_Thread.UsingThreadClass;

public class World extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
