import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Chase Cutshall
 */

public class ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String principle;
        System.out.print(" What is the principle? ");

        principle = input.next();

        Integer a = Integer.parseInt(principle);

        String interestrate;
        System.out.print(" What is the rate of interest? ");

        interestrate = input.next();

        Double b = Double.parseDouble(interestrate);


        String years;
        System.out.print(" How long is the interest accrued for? ");

        years = input.next();

        Integer c = Integer.parseInt(years);

        String compound ;
        System.out.print(" How many times compounded? ");

        compound = input.next();

        Integer d = Integer.parseInt(compound);



        double interest = b / 100;
        double y = a * (1 + b/d);
        double x = (d * c);
        double amount = Math.pow(y, x);

        System.out.print("After " +c+ " years at " + interest + "% compounded " + d +" times, the investment will be worth $" + amount);
    }
}