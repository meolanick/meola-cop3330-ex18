/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int temperature;
        int C;
        int F;
        String unit;

        System.out.println("Are you converting from Celsius or Fahrenheit?");
        System.out.println("Celcius = C");
        System.out.println("Fahrenheit = F");
        System.out.println("Enter C or F:");
        unit = scan.next();

        if( unit.equalsIgnoreCase("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit:");
            F = scan.nextInt();
            C = ( F - 32 ) * ( 5 / 9 );
            System.out.println("The temp in Celsius is: " + C );
        }

        if( unit.equalsIgnoreCase("F"))
        {
            System.out.println("Please enter the temperature in Celsius:");
            C = scan.nextInt();
            F = ( C *  9 / 5  ) + 32;
            System.out.println("The temp in Fahrenheit is: " + F );
        }
    }
}
