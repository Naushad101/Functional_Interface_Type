import java.util.ArrayList;
import java.util.List;

public class SumOfAllEvenNumber {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 100; i++){
            list.add(i);
        }
        final int[] sum = {0};
        list.forEach((num)->{
            if(num % 2 == 0){
               sum[0] = sum[0] +num;
            }
        });
        System.out.println(sum[0]);
    }
}
