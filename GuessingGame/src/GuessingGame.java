// if and else statements

import static java.lang.System.out; // when you want to read from a keyboard use this
import java.util.Random;// when you want to read from a keyboard use this
import java.util.Scanner; // when you want to read from a keyboard use this

public class GuessingGame
{
    public static void main(String args[])
    {

        Scanner keyboard = new Scanner(System.in);// system.in stands for keyboard
        out.print("enter a number from 1 to 10: ");
        int inputNumber = keyboard.nextInt();// when you want to read from a keyboard use this
        int randomNumber = new Random().nextInt(10) + 1;
        if (inputNumber == randomNumber)//does the inputNumber = randomNumber? (== compare)if yes...
        {
            System.out.print("**************");
            System.out.print("**You Win**");
            System.out.print("**************");
        } else //if no....
        {
            System.out.print("You Lose .");
            System.out.print("The random number was ");
            System.out.print(randomNumber + ". ");
        }
        out.print("Thank you for playing");
        keyboard.close(); //disconnects java program from keyboard
        //------------------------------------------------------------------------------


    }
}