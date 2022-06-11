/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package black.jack;

/**
 *
 * @author User
 */
public class Player {
    
    private int counter = 2;
    private Card[] cards = new Card[counter];
    private String number;
    private int bet;
    
    public Player(String num, int _bet){
        number = num;
        bet = _bet;
    }
    
    public void addCard(){
    }
    
    public String showCards(){
        return "cards";
    }
}
