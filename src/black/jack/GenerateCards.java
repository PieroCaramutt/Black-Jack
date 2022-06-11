/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black.jack;

/** highly cohesive
 * generated cards 52 and store in array
 * @author srinivsi
 */
public class GenerateCards 
{
    int size = 52;
   Card[] deck = new Card[size];
   public void generate()
   {
       int counter =0;
       for(Card.Suit  s : Card.Suit.values())
       {
          for(  Card.Value v :  Card.Value.values())// hearts,ace
          {
             deck[counter] = new Card(s,v);  
             counter++;
           }
       }
   }
}