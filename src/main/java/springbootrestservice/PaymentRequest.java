package springbootrestservice;

public class PaymentRequest {

    private int currencyId;
    private String nameId;
    private double balance;
    private boolean treasury;

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public boolean getTreasury() {
        return treasury;
    }

    public void setTreasury(boolean treasury) {
        this.treasury = treasury;
    }
}
