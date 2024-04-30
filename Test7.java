public class Test7 extends Thread {
    public void run(){
        System.out.println("Thread task "+ Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        System.out.println("hello "+Thread.currentThread().isAlive());
        Test7 t = new Test7(); 
        t.setName("vikash");
        t.start();

        Test7 t1 = new Test7(); 
        t1.setName("programming");
        t1.start();
    }
}
