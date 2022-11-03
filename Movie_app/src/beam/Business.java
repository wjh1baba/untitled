package beam;

public class Business extends User{
    private String bsname;
    private String address;

    public Business() {
    }

    public Business(String username, String password, String name, char sex, String phone, double money, String bsname, String address) {
        super(username, password, name, sex, phone, money);
        this.bsname = bsname;
        this.address = address;
    }

    public String getBsname() {
        return bsname;
    }

    public void setBsname(String bsname) {
        this.bsname = bsname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
