package oct.ex_11102024_encap;

public class Lab136 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin( "admin", "password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "admin123");
       // System.out.println(vwoLogin1.password);
       // vwoLogin1.password = "pass123;>?"
        System.out.println(vwoLogin1.getPassword());
        vwoLogin1.setPassword("newpassword");
        System.out.println(vwoLogin1.getPassword());
    }
}
