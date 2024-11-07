package sept.ex_23092024;

public class Lab083 {
    public static void main(String[] args) {
        // // jdk > 13
        int itemcode = 006;
        switch (itemcode){
            case 001, 002, 005:
                ;
                System.out.println("all of them are electronic gadget");
                break;
            case 004, 006, 007:
                    System.out.println("this is mechanical gadget");
                    break;
            default:
                System.out.println("none");
                break;

        }
    }
}
