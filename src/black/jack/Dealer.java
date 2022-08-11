/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package black.jack;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author User
 */
public class Dealer extends Player{
    
    ArrayList<Card> dealerCards = new ArrayList();
    
    //Constructor
    public Dealer(double bet){
        super("Dealer", bet);
        generate();
        Collections.shuffle(cards);
        dealerCards.add(super.cards.get(0));super.cards.remove(0);
        dealerCards.add(super.cards.get(0));super.cards.remove(0);
    }
    
    public void showCards(){
        System.out.println("The "+super.getName()+"'s card are:");
        for(Card c : dealerCards){
            System.out.println(c.getSuit()+" "+c.getValue());
        }
    }
    
    
    //Dealer Draws Cards
    public void drawCards(){
        int value = dealerCards.get(0).getValue()+dealerCards.get(1).getValue();
        if(value < 16){
            dealerCards.add(super.cards.get(0));
            super.cards.remove(0);
        }
        else
            System.out.println("Dealer cannot draw more cards");
    };   
}   