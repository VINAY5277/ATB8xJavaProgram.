package oct.ex_23102024_wrapper_exception;

public class Lab177_Exception_MUlticatch {
    public static void main(String[] args) {
        int b = 0; // Arithmetic Exception
        try {
            String ip = args[0];
            int a = Integer.parseInt(ip);
            b = 100 / a;
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }
}
