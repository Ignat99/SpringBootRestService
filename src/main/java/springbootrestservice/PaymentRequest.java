package springbootrestservice;

import java.util.Currency;

public class PaymentRequest {

    private Currency currencyId;
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

    public Currency getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Currency currencyId) {
        this.currencyId = currencyId;
    }

    public boolean getTreasury() {
        return treasury;
    }

    public void setTreasury(boolean treasury) {
        this.treasury = treasury;
    }
}
