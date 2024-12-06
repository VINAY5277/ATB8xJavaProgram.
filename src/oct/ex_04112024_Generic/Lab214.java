package oct.ex_04112024_Generic;

public class Lab214 {
    public static void main(String[] args) {
        temp(12);
        temp(true);
        temp("pramod");
        // t - ref - it can be anything.
    }

    public static <T> void temp(T a){
        System.out.println(a);
    }

}
