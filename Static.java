interface C {
    static void sayHello() {
        System.out.println("Hello");
    }
}

public class Static implements A {
    public static void main(String[] args) {
        C.sayHello();
    }
}
