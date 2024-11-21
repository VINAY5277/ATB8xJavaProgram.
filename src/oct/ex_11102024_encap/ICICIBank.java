package oct.ex_11102024_encap;

public class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name, long bal){
        this.name = name;
        this.bal = bal;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }
}
