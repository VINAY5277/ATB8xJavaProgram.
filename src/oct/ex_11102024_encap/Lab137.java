package oct.ex_11102024_encap;

public class Lab137 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("amit", 100);
        // amit.bal = 10000; private name
        // amit.setbal(100000);

        // this should allowed to only admin

        // write a code to connect with mysql
        // admin
        boolean are_you_admin = true;
        ICICIBank admin = new ICICIBank("admin", 1000);
        
    }
}
