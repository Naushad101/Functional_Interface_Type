import java.util.Scanner;
import java.util.stream.IntStream;

public class Facto {
    public static void main(String[] args) {
        int n = 4;
        int fact= IntStream.rangeClosed(1,n).reduce(1, (x, y) -> x*y);
        System.out.println(fact);
    }
}
