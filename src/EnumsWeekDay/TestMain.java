package EnumsWeekDay;

import java.util.Random;
import java.util.Scanner;

public class TestMain extends Weekdays {
  public static void main(String[] args) {

    System.out.println(Weekday.Wednesday);
    //Her printer vi onsdag kun
    //Eller på denne måde
    Weekdays.Weekday W = Weekday.Wednesday;
    System.out.println(W);


    Scanner input = new Scanner(System.in);
    System.out.println("\nYou have to put in a number between 1-7 where 1 is Monday, 2 is Tuesday and etc.");
    System.out.print("Enter your number here: ");
    int inputNumber = input.nextInt();
    Weekdays get = new Weekdays();
    System.out.print("And your weekday is: ");
    System.out.println(get.getWeekDay(inputNumber));


    System.out.println("\nLets make java pick a random number between 1-7 and then show the weekday");
    Random rand = new Random();
    int randomNumber = rand.nextInt(7) + 1;
    System.out.println("The Random number is: " + randomNumber);
    System.out.print("And the weekday is ");
    System.out.println(get.getWeekDay(randomNumber));


  }
}

