import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b && a<c){
            if(b<c) System.out.print(a+" "+b+" "+c);
            else System.out.print(a+" "+c+" "+b);
        }
        else if(b<a && b<c){
            if(a<c) System.out.print(b+" "+a+" "+c);
            else System.out.print(b+" "+c+" "+a);
        }
        else{
            if(a<b) System.out.print(c+" "+a+" "+b);
            else System.out.print(c+" "+b+" "+a);
        }


    }
}