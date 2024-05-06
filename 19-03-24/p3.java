public class p3 extends Thread {

    public void run() {
        System.out.println("Hello Thread " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        p3 thread1 = new p3();
        p3 thread2 = new p3();
        p3 thread3 = new p3();

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);

        thread3.start();
        thread2.start();
        thread1.start();
    }
}
