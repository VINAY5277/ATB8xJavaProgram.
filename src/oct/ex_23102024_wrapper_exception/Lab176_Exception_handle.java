package oct.ex_23102024_wrapper_exception;

public class Lab176_Exception_handle {
    public static void main(String[] args) {

        int a = 0;
        try {
        int c = 10/a;  //ArithmeticException
        System.out.println(c);
    } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("u will be always executed");
        }
        }
}
