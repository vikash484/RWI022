class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                // Print the current thread's name
                System.out.println("I am " + Thread.currentThread().getName());

                // Sleep for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the interrupted exception
                System.out.println("Interrupted");
            }
        }
    }
}