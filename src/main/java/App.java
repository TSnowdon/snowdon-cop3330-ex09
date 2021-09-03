import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String firstInput;
        String secondInput;
        int feetLength;
        int feetWidth;
        int gallonRatio = 350;

        System.out.print("What is the length of the ceiling? ");
        firstInput = reader.nextLine();
        System.out.print("What is the width of the ceiling? ");
        secondInput = reader.nextLine();
        try {
            feetLength = Integer.parseInt(firstInput);
            feetWidth = Integer.parseInt(secondInput);
        } catch (Exception e) {
            System.out.println("Invalid input! Please run the program again and try a different value.");
            return;
        }
        double squareFeet = feetLength * feetWidth;
        long totalGallons = Math.round(Math.ceil(squareFeet / gallonRatio));
        System.out.println("You will need to purchase " + totalGallons + " gallons of paint to cover " + (int) squareFeet + " square feet.");
    }
}
