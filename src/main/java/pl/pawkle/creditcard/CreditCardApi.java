package pl.pawkle.creditcard;

class CreditCardApi{
    CreditCardPool pool;

    public void withdraw(String cardNumber, double money){
        pool.find(cardNumber)
        .withdraw(BigDecimal.valueOf(money));
    }
}