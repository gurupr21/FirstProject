package exceptions;

public class ExceptiondDemo {

    public static void show() {
          sayHello(null);
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
