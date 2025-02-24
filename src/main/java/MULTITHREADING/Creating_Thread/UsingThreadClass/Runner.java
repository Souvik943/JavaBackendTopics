package MULTITHREADING.Creating_Thread.UsingThreadClass;

public class Runner {
    public static void main(String[] args) {
        World world = new World();
        world.start();
        System.out.println(Thread.currentThread().getName());
    }
}
