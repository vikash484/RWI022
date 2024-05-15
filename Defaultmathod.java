interface Bike {
    default void sayHello() {
        System.out.println("Hello");
    }
}

class Vehicle implements Bike {
    void byehello(){
        System.out.println("bye");
    }

}

public class Defaultmathod {
    public static void main(String[] args) {
        Vehicle V = new Vehicle();
        V.byehello();
        V.sayHello();

    }
}
