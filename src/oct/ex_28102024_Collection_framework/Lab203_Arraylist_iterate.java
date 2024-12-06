package oct.ex_28102024_Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_Arraylist_iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("pramod");
        mylist.add("amit");
        mylist.add("dutta");

        System.out.println(" - to print arraylist -1");

        for (String str : mylist){
            System.out.println(str);

            System.out.println(" - to print arraylist -2");
            for (int i = 0; i< mylist.size(); i++) System.out.println(mylist.get(i));

            System.out.println(" - to print arraylist -3");
            Iterator<String> iterator = mylist.iterator();
            while ((iterator.hasNext())){
                System.out.println(iterator.next());
            }

        }
    }
}