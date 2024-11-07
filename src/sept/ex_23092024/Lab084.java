package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        int itemcode = 001; // jdk >13

        switch (itemcode){
            case 001 -> System.out.println("its a laptop");
            case 002 -> System.out.println("its a desktop");
            case 003, 004 -> System.out.println("its a mobile phone");
            default -> System.out.println("hello");
        }
    }
}
