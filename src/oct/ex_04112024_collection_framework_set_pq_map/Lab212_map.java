package oct.ex_04112024_collection_framework_set_pq_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab212_map {
    public static void main(String[] args) {
        //name: vinay, roll no:23, phone:9860433135
        Map m1 = new HashMap();
      //  Map m1 = new LinkedHashMap();
       // Map m1 = new TreeMap();

        m1.put("name","vinay");
        m1.put("roll no",123);
        m1.put("phone",98604331);
        System.out.println(m1);
    }
}
