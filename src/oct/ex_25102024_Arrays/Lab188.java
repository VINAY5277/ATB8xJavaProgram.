package oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab188 {
    public static void main(String[] args) {
        int[] marks ={51,100,90,87,91};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[4]); //ArrayIndexOutOfBoundsException

        int[] marks_2 = new int[5];
        // 5 length
        marks_2[0] = 11;
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        marks_2[4] = 15;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[4]);

        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
