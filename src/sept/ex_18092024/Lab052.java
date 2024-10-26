package sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
        //gst = 18.45
        int course = 100;
        float gst= 18.45f;
        // int total_price = course+gst; // narrowing - implicit - jvm - invalid
        //float total_price = course+gst; // narrowing - implicit - jvm - invalid

        float total_price = course+gst; //narrowing - implicit - jvm - invalid
        System.out.println(total_price);
    }
}
