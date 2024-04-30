public class Test6 extends Thread {
    public void run(){
        System.out.println("Thread task "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("hello "+Thread.currentThread().getName());
        Test6 t = new Test6();
        t.setName("vikash");
        t.start();

        Test6 t1 = new Test6();
        t1.setName("programming");
        t1.start();
    }
}
