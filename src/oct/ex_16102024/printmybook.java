package oct.ex_16102024;

public class printmybook extends book{

    @Override
    void getdetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}
