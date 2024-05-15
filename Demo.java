public class Demo {
    public static void main(String[] args) {
        System.out.println("Thread creation");
        System.out.println(Thread.currentThread().getName());


        MyThread myThread = new MyThread();
        Thread t1 = new Thread();
        t1.start();


        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am thread " + Thread.currentThread().getName());
            }
        };

        Thread t3 = new Thread(t2);
        t3.start();


        Thread t4 = new Thread(() -> {
            System.out.println("I am lambda thread " + Thread.currentThread().getName());
        });
        t4.start();
    }
}