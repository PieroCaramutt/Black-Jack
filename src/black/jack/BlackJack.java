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
        int sum1 = 0;
        int sum2 = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Set a name");
        String name = in.next();
        System.out.println("\nSet a bet");
        double bet = in.nextDouble();
       
        //Create the players
       Players p1 = new Players(name, bet);
       Dealer dealer = new Dealer(bet);
       
       //p1.drawCards();
       p1.showCards();
       sum2 = p1.playerCards.get(0).getValue()+ p1.playerCards.get(1).getValue();
       System.out.println(sum2);
       //dealer.drawCards();
       dealer.showCards();
       sum1 = dealer.dealerCards.get(0).getValue()+ dealer.dealerCards.get(1).getValue();
       System.out.println(sum1);
       
       System.out.println("Would you like to draw a card or pass?");
       String answer = in.next();
       
       if("draw".equals(answer)){
           p1.drawCards();
           p1.showCards();
           p1.sum();
           p1.getSumP();
        }
       if("pass".equals(answer)){
           p1.showCards();
           p1.sum();
           p1.getSumP();
       }
       
       
       System.out.println("Would the dealer like to draw a card or pass?");
       String answerD = in.next();
       
       if("draw".equals(answerD) && dealer.getSumD()<=16){
           dealer.drawCards();
           dealer.showCards();
           dealer.sum();
           dealer.getSumD();
       }
       else if(dealer.getSumD()>16 && "draw".equals(answerD)){
           System.out.println("Dealer cannot draw more cards");
           dealer.showCards();
           dealer.sum();
           dealer.getSumD();
       }
       
     System.out.println("");
     
        p1.showCards();
        System.out.println(p1.getSumP());
        
        dealer.showCards();
        System.out.println(dealer.getSumD());

           
        if(p1.getSumP()>dealer.getSumD() && p1.getSumP()<22){
            System.out.println("The pleayer one is the winner");
        }
        else if(p1.getSumP()<dealer.getSumD()&& dealer.getSumD()<22){
            System.out.println("The dealer is the winner");
        }
        else if(p1.getSumP()>22 && dealer.getSumD()>22){
            System.out.println("Draw");
        }
        else if(p1.getSumP()>dealer.getSumD() && dealer.getSumD()>22 ){
            System.out.println("Player one is the winner");
        }
        else if(p1.getSumP()<dealer.getSumD()&& p1.getSumP()>22){
            System.out.println("Dealer the is the winner");
        }
        else 
            System.out.println("draw");
       
       
       
       
       
    }
    
}
