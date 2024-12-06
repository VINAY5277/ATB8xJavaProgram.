package oct.ex_30102024_Collection_framework_part2;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Lab209_set {
    //list -> duplicate allows
    //set -> duplicate doesent allows
    public static void main(String[] args) {


        Set hs = new HashSet();  // hashing mechanism to store the element, no order
        Set lhs = new LinkedHashSet();// oreder will be maintened
        Set ts = new TreeSet();  // store the element and order will be maintained

        hs.add("pramod");
        hs.add("rpmod");
        hs.add("amit");
        System.out.println(hs);

    }
}