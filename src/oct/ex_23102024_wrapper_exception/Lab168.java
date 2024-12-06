package oct.ex_23102024_wrapper_exception;

public class Lab168 {
    public static void main(String[] args) {
        String num = "10";
        Integer a = Integer.valueOf(num);
        System.out.println(a);
        int a2 = a;  //unboxing

        //String to primitive
        int a3 = Integer.valueOf(num);
    }
}
