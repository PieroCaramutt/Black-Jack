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
public class Players extends Player{
    
    ArrayList<Card> playerCards = new ArrayList();//Player Cards at least 2
    private int sumP = 0;
    private int sum1 = 0;
        
    //Constructor
    public Players(String name, double bet){
        super(name, bet);
        generate();
        Collections.shuffle(cards);
        playerCards.add(super.cards.get(0));super.cards.remove(0);
        playerCards.add(super.cards.get(0));super.cards.remove(0);
        
    }
    
    //Sum
    public void sum(){
        for (Card s : playerCards){
        sumP += s.getValue();
                }
        System.out.println(sumP);
    }
    
    
    //Show cards
    public void showCards(){
        System.out.println("The "+super.getName()+"'s card are:");
        for(Card c : playerCards){
            System.out.println(c.getSuit()+" "+c.getValue());
        }      
    }
    
    //Players Draw Cards
    public void drawCards(){
        playerCards.add(super.cards.get(cards.size()-1));
        super.cards.remove(0);
    }
    
    public double getSumP(){
        return sumP;
    }
    
}
