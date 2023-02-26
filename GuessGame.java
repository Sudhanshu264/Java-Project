import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Guesser
{
    int guessNum;

    int guessingNumber()
    {
        System.out.println("Guesser kindly guess the number");
        Scanner scan=new Scanner(System.in);
        guessNum=scan.nextInt();
        return guessNum;


    }
}

class Player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        guessNum= scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser= g.guessingNumber();
    }
    void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();   

        numFromPlayer1= p1.guessingNumber();
        numFromPlayer2= p2.guessingNumber();
        numFromPlayer3= p3.guessingNumber();
    }
    void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
             if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
             {
                System.out.println("All win");
             }
           
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player 1 and Player 2 won the game");
            }
                if(numFromGuesser==numFromPlayer3)
                {
                    System.out.println("player1 and player 3 won the game");
                }
                else
                {
                    System.out.println("Player 1 won the game");

                }
        
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                
             if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player 2 and Player 3 won the game");
            }
            else
            {
                System.out.println("Player2 won the game");            }
            
        }
        
    
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player won the game");
        }
        else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player3 won the game");
        }
        else
        {
            System.out.println("you lost the game");
        }
    }
   
}



public class GuessGame {
    public static void main(String[] args) {
       Umpire u = new Umpire();
       u.collectNumFromGuesser();
       u.collectNumFromPlayer();
       u.compare();
        
    }
}
