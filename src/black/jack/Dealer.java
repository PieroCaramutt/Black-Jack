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
public class Dealer extends Player{
    
    
    Random random = new Random();
    
    public Dealer(int bet){
        super("Dealer", bet);
        bet = super.getBet();
    }
    
    /*public void generateCard(){
        for(int i=0; i<2; i++){
            dealerCards[i]= dealerDeck.deck[random.nextInt()];
        }*/

    
   public void addCards(){};

    
}
