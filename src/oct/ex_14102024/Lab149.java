package oct.ex_14102024;

public class Lab149 {
}

interface I3{
    default void start(){
        System.out.println("Body! DM");
    }
    void stop();
    void car();

    static void ss(){
        System.out.println("static can also body in interface");
    }
}

abstract class aa {
    void f1(){
        System.out.println("concrete method");
    }
    abstract void f2();

    static void f4(){
        System.out.println("yes");
    }
}