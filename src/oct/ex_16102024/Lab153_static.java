package oct.ex_16102024;

public class Lab153_static {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.school_name);
        Student.school_name = "xyz";
        System.out.println(Student.school_name);


    }

        static class Student{
            int age; // instance variable
            static String school_name; //static variable
    }
}
