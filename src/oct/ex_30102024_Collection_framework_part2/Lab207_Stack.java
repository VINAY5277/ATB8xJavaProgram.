package oct.ex_30102024_Collection_framework_part2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("pramod");
        s.add("dutta");
        System.out.println(s);

        Stack books  = new Stack();
        books.push("python");
        books.push("java");
        books.push("c#");
        System.out.println(books);
        System.out.println(books.pop());
    }
}
