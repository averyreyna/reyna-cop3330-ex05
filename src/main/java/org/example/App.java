/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // inputs 1 and 2 ask for the user's two numbers
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first number? ");
        int inputNumOne = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is your second number? ");
        int inputNumTwo = Integer.parseInt(input2.nextLine());

        // math for the inputted two numbers, seperated from the actual computation
        int Addition = inputNumOne + inputNumTwo;
        int Subtraction = inputNumOne - inputNumTwo;
        int Multiplication = inputNumOne * inputNumTwo;
        int Division = inputNumOne / inputNumTwo;

        // formatted outputs for the math in the previous lines
        String additionOutput = String.format("%d + %d = %d", inputNumOne, inputNumTwo, Addition);
        String subtractionOutput = String.format("%d - %d = %d", inputNumOne, inputNumTwo, Subtraction);
        String multiplicationOutput = String.format("%d * %d = %d", inputNumOne, inputNumTwo, Multiplication);
        String divisionOutput = String.format("%d / %d = %d", inputNumOne, inputNumTwo, Division);

        System.out.println(additionOutput + "\n" + subtractionOutput + "\n" + multiplicationOutput + "\n" + divisionOutput);
    }
}