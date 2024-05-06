public class p2 implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        p2 myThread = new p2();

        Thread thread = new Thread(myThread);

        thread.start();
    }
}
