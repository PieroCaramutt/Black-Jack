/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package black.jack;
/**
 *
 * @author User
 */
public abstract class Player extends GenerateCards{
    
    private String name;
    private double bet;
    
    public Player(String _name, double _bet){
        name = _name;
        bet = _bet;
    }
    
    public String getName(){return name;}
    public double getBet(){
        return bet;
    }
    
    public abstract void showCards();
    
    public abstract void drawCards();
}
