package pl.pawkle.creditcard;

import pl.pawkle.creditcard.CreditCard;
import org.junit.Assert;
import org.junit.Test;

class CreditCardTest{
   /* @Test
     public void assignCreditLimitToCard(){
        //arrange
        CreditCard card = new CreditCard();
        //act
        card.setLimit(2000);
        //assert
        Assert.assertTrue(card.getLimit() == 2000);
    }*/
    @Test
    public void blockCreditCard(){
       //arrange
       CreditCard card = new CreditCard();
       //act
       card.blockCreditCard();
       //assert
       Assert.assertTrue(card.getIsBlocked());
   }
    @Test
    public void canRepayDebt(){
        //arrange
        CreditCard card = new CreditCard();
        //act
        card.setLimit(200);
        card.withdraw(300);
        card.repayDebt(200);
        //assert
        Assert.assertFalse(card.getIsBlocked());
    }
    @Test
    public void withdrawMoneyWhenCardBlocked(){
        //arrange
        CreditCard card = new CreditCard();
        //act
        card.setLimit(200);
        card.withdraw(300);
        //assert
        Assert.assertTrue(card.getIsBlocked());
    }
    @Test
    public void withdrawMoneyWhenCardNotBlocked(){
        //arrange
        CreditCard card = new CreditCard();
        //act
        card.setLimit(200);
        card.withdraw(100);
        //assert
        Assert.assertFalse(card.getIsBlocked());
    }
}