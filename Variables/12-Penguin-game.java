import java.util.Scanner;

public class Penguin
{
    public static void main(String[] args) 
  {

        Scanner scanner = new Scanner(System.in);
        int exchange = 21;

        System.out.print("Welcome to the Club Penguin money converter!");
        System.out.print("How many coins do you have? ");
        int coins = scanner.nextInt(); 

        int dollars = coins * exchange;
        
        System.out.println("You have the following amount of dollars:");
        System.out.println(dollars);                                             // Ans: 441
    }
}
