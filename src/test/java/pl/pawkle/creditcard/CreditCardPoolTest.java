package pl.pawkle.creditcard;

import org.junit.Assert;
import org.junit.Test;

class CreditCardPoolTest{
    private final static String number = "123456789";

    @Test
    public void allowAddAndFindCard(){
        CreditCardPool pool = new CreditCardPool();
        CreditCard card = new CreditCard();

        pool.add(card);
        CreditCard loaded = pool.find(number);

        Assert.assertTrue(loaded.getNumber().isEquals(number));


    }
}