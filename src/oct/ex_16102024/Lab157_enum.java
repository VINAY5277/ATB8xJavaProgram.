package oct.ex_16102024;

public class Lab157_enum {
    public static void main(String[] args) {
        System.out.println(color.RED.getHexcode());

    }
}

enum color{
    RED("#FF0000");

    private String hexcode;

    private color(String hexcode){
        this.hexcode = hexcode;
    }

    public String getHexcode(){
        return this.hexcode;
    }
}
