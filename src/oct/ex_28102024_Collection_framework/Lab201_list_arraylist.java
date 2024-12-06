package oct.ex_28102024_Collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Lab201_list_arraylist {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(96);
        marks.add(89);
        System.out.println(marks);
        //sorting
        Collections.sort(marks);
        System.out.println(marks);

    }
}
