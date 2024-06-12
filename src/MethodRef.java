public class MethodRef {
    public void myMEthod(){
        System.out.println("Method reference is java 8 features ");
    }

    public static void main(String[] a){
        Vehicle e = new MethodRef()::myMEthod;
        e.start();

    }
}
