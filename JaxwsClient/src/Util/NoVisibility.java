package Util;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 4/4/12
 * Time: 2:30 PM
 */
public class NoVisibility {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}

