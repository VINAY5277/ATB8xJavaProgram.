package task;

public class task_18_sept {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a+a--+a--);
        System.out.println(a);

        // part -> A -> --a, exp = 9, a=9
        // part -> B -> a++, exp = 9, a=8
        // part -> B -> a++, exp = 8, a=7
    }
}
