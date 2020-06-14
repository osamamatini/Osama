package se.lexicon;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        {System.out.println( "Hallo" );
            System.out.println("Osama!");}

        Scanner input = new Scanner(System.in);
        int daysOfYear;
        System.out.println("Enter the number of days of the year:");
        daysOfYear = input.nextInt();
        if (daysOfYear>365) {
            System.out.println("Yes, it is leap year!");

        }else {
            System.out.println("No, it is not leap year ");


        }

    }


}

