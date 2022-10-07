package ATM;

public class Account {
    //    成员变量 私有
    private String cardId;
    private String userName;
    private String passWord;
    private double morey;
    private double quotaMorey;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMorey() {
        return morey;
    }

    public void setMorey(double morey) {
        this.morey = morey;
    }

    public double getQuotaMorey() {
        return quotaMorey;
    }

    public void setQuotaMorey(double quotaMorey) {
        this.quotaMorey = quotaMorey;
    }
}
