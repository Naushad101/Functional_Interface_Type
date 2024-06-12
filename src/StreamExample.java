import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        Optional<Integer> mayInt = Optional.ofNullable(null);

        if(mayInt.isPresent()){
            System.out.println(mayInt.get());
        }
        else System.out.println("Not Found");

       mayInt.ifPresent(i-> System.out.println(i));


//        List<Integer> stream = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(stream);

//        String[] str = {"Hi","How","Are","You"};
//
//        Stream<String> st = Arrays.stream(str);
//        Long ans = st.collect(Collectors.counting());
//        System.out.println(ans);

//        int sum = list.stream().filter(num->num%2==0).reduce(0,(n,n1)->n+n1);
//        System.out.println(sum);


//        list.stream().filter(num->num>3)
//                .peek(num-> System.out.println("After filtering "+num))
//                .map(num->num*-1)
//                .peek(num-> System.out.println("After negating "+num))
//                .sorted()
//                .peek(num-> System.out.println("After sorting "+num)).count();
//


//        System.out.println("The value of outPut is: " + outPut);
//        Stream<String> st = Stream.of("HI","HOW","ARE","YOU");
//        Stream<String> res = st.filter(str->str.length()<=2);
//        System.out.println(res.toList());



//        List<List<Integer>> ans = Arrays.asList(
//                Arrays.asList(1,2,3,4),
//                Arrays.asList(5,6,7,8,9)
//        );

//        Stream<Integer> st = ans.stream().flatMap((List<Integer> a)->a.stream());
//        System.out.println(st.toList());

//        Stream<Integer> st = ans.stream().flatMap((List<Integer> a)->a.stream()).map(i->2*i);
//       Stream<Integer> st1 = st.filter(num->num%2==0);
//        System.out.println(st1.toList());
//


//        long startTime = System.currentTimeMillis();
//
//        list.stream()
//                .map(num->num*num)
//                .forEach(num-> System.out.println(num));
//        System.out.println("The time taken using stream is:"+(System.currentTimeMillis()-startTime));
//
//        long pStartTime = System.currentTimeMillis();
//
//        list.parallelStream()
//                .map(num->num*num)
//                .forEach(num-> System.out.println(num));
//
//        System.out.println("The time taken using parallel stream is:"+(System.currentTimeMillis()-pStartTime));


    }
}
