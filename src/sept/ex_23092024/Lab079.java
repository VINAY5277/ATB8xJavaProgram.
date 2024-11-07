package sept.ex_23092024;

public class Lab079 {
    public static void main(String[] args) {
        //web automation
        // i will ask user which browser you want to run the code
        // chrome -> execute chrome
        // edge -> edge cases.

         String browser = "chrome";
         switch (browser){
             case "chrome":
                 System.out.println("starting the chrome browser");
                 // further code to start the chrome
                 // webdriver = new chrome(); // selenium code break;
                 break;
             case "firefox":
                         System.out.println("starting the firefox browser");
                         // further code to start the chrome
                         // webdriver = new chrome(); // selenium code break;
                         break;
             case "edge":
                 System.out.println("execute the edge code");
                 break;
             default:
                 System.out.println("I have not idea which browser is this");
                 break;
         }
    }
}
