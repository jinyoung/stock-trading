package stock.trading.external;

public class Asset {

    private String item;
    private Double amount;
    private String accountId;

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

}
