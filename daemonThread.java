public class daemonThread extends Thread {
    public void run() {
        System.out.println("daemon thread");
    }
    
    public static void main(String[] args) {
        System.out.println("main Thread");
        daemonThread d = new daemonThread();
        d.setDaemon(true); 
        d.start();
    }
}
