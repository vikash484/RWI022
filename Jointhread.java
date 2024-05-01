public class Jointhread extends Thread {
    public void run() {
        for (int i = 1; i<=3; i++)
        
            System.out.println(i);
    }

    public static void main(String[] args) {
        Jointhread j1 = new Jointhread();
        j1.start();
        try {
            j1.join();
        } catch (Exception e) {
           System.out.println(e);
        }

        Jointhread j2 = new Jointhread();
        Jointhread j3 = new Jointhread();
        Jointhread j4 = new Jointhread();
        j2.start();
        j3.setPriority(10); 
        j3.start();
        j4.start(); 

        try {
            j2.join();
            j3.join();
            j4.join();
        } catch (Exception e) {
            System.out.println(e); 
        }
    }
}
