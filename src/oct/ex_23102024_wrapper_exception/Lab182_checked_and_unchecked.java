package oct.ex_23102024_wrapper_exception;

public class Lab182_checked_and_unchecked {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("unchecked");
        }

        try {
          //  FileReader f = new FileReader(new File("C://abc.txt"));
        //} catch (fileNotFoundException e) {
           // throw new RuntimeException(e);
        } finally {
            System.out.println("finally checked exception");
        }
    }
}