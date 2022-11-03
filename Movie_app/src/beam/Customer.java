package beam;
public class Customer extends User{
    public Customer() {
    }

    public Customer(String username, String password, String name, char sex, String phone, double money) {
        super(username, password, name, sex, phone, money);
    }
}
