package sept.ex_16092024;

public class Lab042 {
    public static void main(String[] args) {

        // and && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || F -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
