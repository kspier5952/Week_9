import java.util.*;
public class Game21 {
    public static void main(String[]args){
        int card1;
        int card2;
        int cardsum;
        int anothercard;
        int dealer1;
        int dealer2;
        int dealer3;
        int dealersum;
        card1 = (int)(10*Math.random()+1);
        card2 = (int)(10*Math.random()+1);
        cardsum = (card1 + card2);
        Scanner input = new Scanner(System.in);
        System.out.println("You have a " + card1 + " and a(n) " + card2 + " for a total of " + cardsum + ".");
        System.out.println("Enter a 1 if you want another card or any other number for no card.");
        anothercard = input.nextInt();
        if (anothercard == 1){
            int card3;
            card3 = (int)(10*Math.random()+1);
            cardsum += card3;
            System.out.println("You got a " + card3 + " for a total of " + cardsum + ".");
        }
        dealer1 = (int)(10*Math.random()+1);
        dealer2 = (int)(10*Math.random()+1);
        dealer3 = (int)(10*Math.random()+1);
        dealersum = (dealer1 + dealer2 + dealer3);
        System.out.println("The dealer has a " + dealer1 + ", " + dealer2 + ", and " + dealer3 + " for a total of " + dealersum + ".");
        input.close();
    }
}
