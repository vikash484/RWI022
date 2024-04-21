abstract class vehicle{
    abstract void start();
}
class car extends vehicle{
    void start()
    {
        System.out.println("car is starting");
    }
}
public class vikashgd {
    public static void main(String[] args) {
        car b1=new car();
        b1.start();

    }
    
}
