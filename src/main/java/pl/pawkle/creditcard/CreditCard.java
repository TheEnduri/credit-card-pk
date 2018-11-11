package pl.pawkle.creditcard;

class CreditCard{
    private BigDecimal limit;
    private boolean blocked = false;
    private BigDecimal balance;
    private String cardNumber;

    public CreditCard(){
        this.cardNumber = "randomNumber";
    }

    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getCardNumber(){
        return this.cardNumber;
    }


    public void setLimit(int limit){
        this.limit = limit;
    }

        public void block() {
        this.blocked = true;
    }

    public boolean isBlocked() {
        return this.blocked;
    }

    public void withdraw(BigDecimal money) {
        if (isWithdrawOverTheLimit(money))
            throw new NotEnoughMoneyException();

        if (isNotEnoughMoney(money))
            throw new NotEnoughMoneyException();

        if (isBlocked())
            throw new TransactionOnBlockedCardException();

        balance = balance.subtract(money);
    }

    private boolean isNotEnoughMoney(BigDecimal money) {
        return money.compareTo(balance) > 0;
    }

    private boolean isWithdrawOverTheLimit(BigDecimal money) {
        return money.compareTo(limit) > 0;
    }
    
	public void repay(BigDecimal money) {
        if (money.compareTo(BigDecimal.ZERO) < 0) {
            throw new CantRepayNegativeAmountException();
        }
        balance = balance.add(money);
    }
    
    public int getLimit(){
        return this.limit;
    }
    public int getBalance(){
        return this.balance;
    }

    public boolean blockCreditCard(){
        return this.isBlocked = true;
    }

}