/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package black.jack;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {  
       /*Player playerOne = new Player("Player One", 100);
       Player dealer = new Player("Dealer", playerOne.getBet());
       
       playerOne.decks.generate();
       playerOne.showCards();*/
        int[] gamep1 = {1, 3, 5};
        int[] gamep2 = {2, 4, 6};
        int round = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("");
        String name = in.next();
        double bet = in.nextDouble();
       
        //Create the players
       Players p1 = new Players(name, bet);
       Dealer dealer = new Dealer(bet);
       
       p1.drawCards();
       p1.showCards();
       
       
       dealer.drawCards();
       dealer.showCards();
    }
    
}
