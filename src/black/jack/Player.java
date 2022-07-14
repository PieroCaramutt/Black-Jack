/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package black.jack;
import java.util.Random;

/**
 *
 * @author User
 */
public class Player {
    
    private int counter = 2;
    private Card[] cards = new Card[counter];
    private String name;
    private int bet;
    Random rand = new Random();
    GenerateCards decks = new GenerateCards();
    
    public Player(String num, int _bet){
        name = num;
        bet = _bet;
    }
    
    public int getCounter(){return counter;}
    public int getBet(){return bet;}
    public String getNumber(){return name;}
    
    public void addCard(){
        counter++;
        for(int i=2; i<counter; i++){
            cards[i]=decks.deck[rand.nextInt()];
        }
    }
    
    public void showCards(){
        for(Card c : cards){
            System.out.println(c.getSuit()+" "+c.getValue());
        }
    }
}
