package sept.ex_18092024;

public class Lab059 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // part -> A -> ++a, exp = 11, a=11
        // part -> B -> a++, exp = 11, a=12
        // part -> B -> a++, exp = 12, a=13

    }
}
