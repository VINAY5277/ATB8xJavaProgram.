package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        long phone_no = 9860433135l;
        //short s= phone no; narrowing - impicit - JVM // invalid
        short s1 = (short)phone_no; // narrowing - explicit - loss // invalid
    }

}
