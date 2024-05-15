import java.util.function.*;

public interface MyInterface {
    @FunctionalInterface
    public interface HelloFunction {
        void sayHello();
    }

    default void sayBye() {

    }
}
