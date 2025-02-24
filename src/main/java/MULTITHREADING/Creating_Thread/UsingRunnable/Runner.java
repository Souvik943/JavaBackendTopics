package MULTITHREADING.Creating_Thread.UsingRunnable;

import MULTITHREADING.Creating_Thread.UsingThreadClass.World;

public class Runner {
    public static void main(String[] args) {
        World world = new World();
        Thread thread = new Thread(world);
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}
