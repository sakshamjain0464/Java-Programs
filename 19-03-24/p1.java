public class p1 extends Thread {
    public void run() {
        System.out.println("Hello Thread");
    }

    public static void main(String[] args) {
        p1 thread = new p1();
        
        thread.start();
    }
}