public class Child extends Parent{

    public static void m(){
        System.out.println("Child static method....");
    }

    public static void main(String[] arg){
        Child p = new Child();
        p.m();
    }
}
