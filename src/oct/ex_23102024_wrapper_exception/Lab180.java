package oct.ex_23102024_wrapper_exception;

public class Lab180 {
    public static void main(String[] args) {

        try {
            String s1 = "pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        }catch (Exception e){
        System.out.println("there is some problem with code");
        System.out.println(e.getMessage());
        }

        System.out.println("end of program");
    }
}
