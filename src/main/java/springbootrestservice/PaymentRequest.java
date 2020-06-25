package springbootrestservice;

import java.util.Currency;

public class PaymentRequest {

    private Currency currencyId;
    private String nameId;
    private double balanceId;
    private boolean treasuryId;

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String name) {
        this.nameId = name;
    }

    public double getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(double balance) {
        this.balanceId = balance;
    }

    public Currency getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Currency currencyId) {
        this.currencyId = currencyId;
    }

    public boolean getTreasuryId() {
        return treasuryId;
    }

    public void setTreasuryId(boolean treasury) {
        this.treasuryId = treasury;
    }
}
