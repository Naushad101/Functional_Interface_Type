import java.util.HashMap;

//@FunctionalInterface
public interface Example {
    int m(String name);
    default void m2(){
        System.out.println("dfafawef");
    }

}
