package oct.ex_04112024_collection_framework_set_pq_map;

import java.util.HashSet;

public class Lab210_set_part2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple");
        System.out.println("set elements:"+ set);
    }
}
