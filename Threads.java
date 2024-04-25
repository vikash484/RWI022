public class Threads implements Runnable {
    public void run() {
        System.out.println("This is a thread class");
    }

    public static void main(String[] args) {
        Threads t1 = new Threads(); 
        Thread th = new Thread(t1); 
        th.start(); 
        System.out.println("Hello");
    }
}
