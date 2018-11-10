package pl.pawkle.creditcard;

class CreditCard{
    private int limit;
    private boolean isBlocked = false;
    private int balance;
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

    public boolean getIsBlocked(){
        return isBlocked;
    }

    public void setLimit(int limit){
        this.limit = limit;
    }

    public int getLimit(){
        return this.limit;
    }
    public int getBalance(){
        return this.balance;
    }

    public void withdraw(int amount){

        int saldo = limit - amount;

        if(amount > limit){
            blockCreditCard();
        }
    }

    public boolean blockCreditCard(){
        return this.isBlocked = true;
    }

}