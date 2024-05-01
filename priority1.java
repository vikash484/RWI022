public class priority1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getPriority()); 
    }
    
    public static void main(String[] args) {
        priority1 p = new priority1(); 
        p.start();
        p.setPriority(10);
    }
}
