package sept.ex_18092024;

import java.util.concurrent.atomic.AtomicInteger;

public class Lab053 {
    public static void main(String[] args) {
        // increment (++) / decrement (--) operators
        // pre and post
        //ready

        // pre - increment - ++operand.
        // value is incremented first and then stored in the result.

        AtomicInteger a = new AtomicInteger(10);
        int b = a.incrementAndGet(); // a = a+1
        // | a |output (b)|
        // 10
        // 11|11
        System.out.println(b);
        System.out.println(a.get());

     //   int a = 10;
        //System.out.println(++a);
        //System.out.println(a);

        // post a++
        // print first and then increase
        //int a_post = 10;
       // System.out.println(a_post++);
        //System.out.println(a_post);
    }
}
