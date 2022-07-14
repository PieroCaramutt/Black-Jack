/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black.jack;

/**
 * model class - raw data card defined
 * @author srinivsi base code
 * @editor Piero Caramutti
 * 
 * Loosely coupling was the oo principles that we used here becasue the objects that we have to created here had to be actualized in 
 * GenerateCards too(GenerateCards.size). 
 * The enums Suit, Value and size in GenerateCards were the values that I edited and the whole code still working without any other change.
 * 
 * The enums allowed us to extend and reuse the code any time
 */
public class Card 
{
public enum Suit {diamonds,clubs,hearts,spades};   
public enum Value {
    ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(10),QUEEN(10),KING(10);
    
    private final int num;
    
    Value(int _num){
        num = _num;
    }
    public int getNum(){return num;}
}
private Suit suit;
private Value value;
public Card(Suit s,Value v)
{
 this.suit=s;
 this.value=v;
}

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
}
