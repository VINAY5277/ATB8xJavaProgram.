package oct.ex_04112024_Generic;

public class Lab215_genericP2 {
    public static void main(String[] args) {
        prinTs(1,"pranos",true);
    }

    public static <T1,T2,T3> void prinTs(T1 a, T2 b, T3 c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }

}
