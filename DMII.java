interface Parent {
    default void sayHello() {
        System.out.println("Hello");
    }
}

class Child implements Parent {
    @Override
    public void sayHello() {
        System.out.println("Child says hello");
    }
}

public class DMII {
    public static void main(String[] args) {
        Parent child = new Child();
        child.sayHello();
    }
}
