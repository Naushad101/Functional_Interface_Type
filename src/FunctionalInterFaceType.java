import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterFaceType {

    //Supplier

    Supplier<String> supplier = ()->{
        System.out.println("Initialization is happening.....");
        return "Lazy Initialization";
    };

    public String getValue(){
        return supplier.get();
    }

    public static void main(String[] args) {

        // Predicate

        Predicate<Integer> predicate = x -> x % 2 == 0;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int ele : arr){
            if(predicate.test(ele)){
                sum+=ele;
            }
        }
        System.out.println("The value of sum is: " + sum);

        // Function

        Function<Integer,Integer> function;
        function = num -> num*2;

        for(int ele : arr){
            System.out.print(ele+" ");
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=function.apply(arr[i]);
        }
        System.out.println();
        for(int ele : arr){
            System.out.print(ele+" ");
        }


        System.out.println();

        // Consumer
        Consumer<Integer> consumer = num -> System.out.print(num+" ");

        for(int ele : arr){
            consumer.accept(ele);
        }

        System.out.println();


        FunctionalInterFaceType f = new FunctionalInterFaceType();
        System.out.println(f.getValue());
        System.out.println(f.getValue());
    }
}
