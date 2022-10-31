package beam;

public class User {
    private String username;
    private String password;
    private String name;
    private char sex;
    private int phone;
    private double money;

    public User() {
    }

    public User(String username, String password, String name, char sex, int phone, double money) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
