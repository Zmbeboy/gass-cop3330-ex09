/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        String length = scan.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String width = scan.nextLine();

        int len = Integer.parseInt(length);
        int wid = Integer.parseInt(width);

        int ftarea = len*wid;
        double gallons = Math.ceil((double)ftarea /350);

        System.out.println(String.format("You will need to purchase %.0f gallons of paint to cover %s square feet.",gallons,ftarea));
    }
}