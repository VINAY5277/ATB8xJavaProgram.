package sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        // type casting
        // widening - implicit, explicit - lossless
        byte b = 10;
        int a = b; // valid - implicit casting - JVM
        int a1 = (int)b; //valid - explicit casting - JVM

        // narrowing
        int val = 200;
        //byte b1 = val; // invalid implicit casting - JVM
        byte b2 = (byte)val; // invalid explicit casting - loss of data
        System.out.println(b2);

    }

}
