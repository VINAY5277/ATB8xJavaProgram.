package oct.ex_23102024_wrapper_exception;

public class Lab175_Exception {
    public static void main(String[] args) {
        //Exception -> event that occurs during the execution of a pro
        //checked and unchecked

        int a = 0;
        int c = 10/a;  //ArithmeticException
        System.out.println(c);
    }
}